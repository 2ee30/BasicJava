package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass03 {
	public static void main(String[] args) {
		int num=3;
		String name="원숭이";
		String addr="상도동";
		//위의 정보를 member 테이블에 insert 하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			//실행할 sql문의 뼈대 구성하기
			String sql="insert into member"
					+ "(num, name, addr)"
					+ "values(?, ?, ?)";
			//sql 문을 수행할 PreparedStatement 객체의 참조값 얻어오기(준비된 pstmt 객체의 참조값을 얻어오기)
			pstmt=conn.prepareStatement(sql);
			//? 에 필요한 값 바인딩하기
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			//sql 문 실행하기
			//executeUpdate() 메소드는 변화된 row의 갯수를 리턴한다.(추가, 삭제 모~두~)
			flag=pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
		if(flag>0) {//성공
			System.out.println("회원정보를 성공적으로 추가했습니다.");
		}else {//실패
			System.out.println("회원정보 추가 실패");
		}
	}
}
