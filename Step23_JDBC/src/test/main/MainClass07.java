package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		
		//한명의 회원 정보를 얻어오고 싶다.
		int num=1; //1번 회원
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			//*띄어쓰기 주의할 것*
			String sql="SELECT num, name AS babo, addr"
				+ " FROM member"
				+ " WHERE num=?";

			//PrepareStatment객체의 참조값 얻어오기	
			pstmt=conn.prepareStatement(sql);
			//?값 바인딩하기
			pstmt.setInt(1, num);
			//sql문 수행하고 select 결과값을 resultSet으로 받아오기
			rs=pstmt.executeQuery();
			while(rs.next()) {
				//커서가 위치한 곳에서 "name" 칼럼에 있는 문자열 읽어오기
				String name=rs.getString("babo");
				//커서가 위치한 곳에서 "addr" 칼럼에 있는 문자열 읽어오기
				String addr=rs.getString("addr");
				
				System.out.println(num+"\t"+name+"\t"+addr);
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		
	}
}
}
