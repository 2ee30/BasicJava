package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass05 {
	public static void main(String[] args) {
		// 1번 회원의 이름을 이정호 로 수정하기
		// 수정할 회원의 정보라고 하자
		int num=7;
		String name="이정호";
		String addr="독산동";
		
		//위의 정보대로 회원정보를 수정하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		
		try {
			conn=new DBConnect().getConn();
			// *띄어쓰기 주의할 것*
			String sql="UPDATE member"
					+ " SET name=?, addr=?"
					+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			//실행
			flag=pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		//위의 작업이 실행되었는지 확인 flag
		if(flag>0) {
			System.out.println("수정\n성공");
		}else {
			System.out.println("수정\\실패");
		}
		
	}
}
