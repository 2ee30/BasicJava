package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		// 삭제할 회원의 정보라고 하자
		int num=2;

		
		//위의 정보대로 회원정보를 수정하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		
		try {
			conn=new DBConnect().getConn();
			// *띄어쓰기 주의할 것*
			String sql="DELETE From member"
					+ " Where num=?";
			pstmt=conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setInt(1, num);
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
			System.out.println("삭제\n성공");
		}else {
			System.out.println("삭제\\실패");
		}
		
	}
}
