package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * member 테이블의 모든 정보를 콘솔창에 출력해보세요.
		 * 단, 회원 번호에 대해서 오름차순 정렬해서
		 */
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			//*띄어쓰기 주의할 것*
			String sql="select num, name, addr"
			+ " from member"
			+ " order by num asc";
					
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				System.out.println(num+"|"+name+"|"+addr);
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
