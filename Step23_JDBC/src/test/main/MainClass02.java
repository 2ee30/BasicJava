package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

/*
 * 사원번호, 사원이름, 부서명을 select 해서 콘솔창에 출력해보세요
 */
public class MainClass02 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql="select e.empno, e.ename, d.dname "
					+ "from emp e, dept d where e.deptno = d.deptno";
			
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				String dname=rs.getString("dname");
				System.out.println(empno+"|"+ename+"|"+dname);
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
