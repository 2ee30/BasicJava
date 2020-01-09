package test.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import test.member.dto.MemberDto;
import test.util.DBConnect;

/*
 *  Data  Access Object (DAO) 
 *  
 *  - insert, update, delete, select 작업을 할 클래스 설계
 */
public class MemberDao {
	
	//회원 전체 목록을 리턴하는 메소드
	public List<MemberDto> getList(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//Select 된 결과를 저장해서 리턴할 객체를 저장할 지역변수 선언
		List<MemberDto> list=new ArrayList<>();
		try {
			conn = new DBConnect().getConn();
			//실행할 select 문 구성하기 
			String sql = "SELECT num, name, addr"
					+ " FROM member"
					+ " ORDER BY num ASC";
			pstmt = conn.prepareStatement(sql);
			// ? 에 값 바인딩하기

			rs = pstmt.executeQuery();
			//ResultSet 객체에서 필요한 값 얻어내기
			while (rs.next()) {
				//select 된 row 하나당 하나의  MemberDto 객체를 생성해서
				MemberDto dto=new MemberDto();
				//row에 있는 정보를 MemberDto 객체에 setter 메소드를
				//이용해서 담고
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				//회원한명의 정보가 담긴 MemberDto 객체의 참조값을
				//ArrayList 객체에 누적시키기
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		//모든 회원정보가 담긴 ArrayList 객체의 참조값을 리턴해주기
		return list;
	}
	
	//회원 한명의 정보를 리턴하는 메소드
	public MemberDto getData(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//Select 된 결과를 저장해서 리턴할 객체를 저장할 지역변수 선언
		MemberDto dto=null;
		try {
			conn = new DBConnect().getConn();
			//실행할 select 문 구성하기 
			String sql = "SELECT name, addr"
						+ " FROM member"
						+ " WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			// ? 에 값 바인딩하기
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			//ResultSet 객체에서 필요한 값 얻어내기
			while (rs.next()) {
				//회원정보를 담을 객체 생성
				dto=new MemberDto();
				//setter 메소드를 이용해서 dto에 회원정보 저장
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		//회원정보가 담긴 MemberDto 객체의 참조값을 리턴해준다.
		return dto;
	}
	
	//회원 한명의 정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DBConnect().getConn();
			//실행할 sql 문의 뼈대 구성하기
			String sql = "UPDATE member"
					+ " SET name=?, addr=?"
					+ " WHERE num=?";
			//sql  문을 수행할 PreparedStatement 객체의 참조값 얻어오기 
			pstmt = conn.prepareStatement(sql);
			//? 에 필요한 값 바인딩하기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			//sql  문 실행하기 
			//executeUpdate() 메소드는 변화된 row  의 갯수를 리턴한다. 
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		if (flag > 0) {//성공
			return true;
		} else {//실패
			return false;
		}
	}
	
	//회원 한명의 정보를 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = new DBConnect().getConn();
			//실행할 sql 문의 뼈대 구성하기
			String sql = "DELETE FROM member"
					+ " WHERE num=?";
			//sql  문을 수행할 PreparedStatement 객체의 참조값 얻어오기 
			pstmt = conn.prepareStatement(sql);
			//? 에 필요한 값 바인딩하기
			pstmt.setInt(1, num);
			//sql  문 실행하기 
			//executeUpdate() 메소드는 변화된 row  의 갯수를 리턴한다. 
			flag = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}

		if (flag > 0) {//성공
			return true;
		} else {//실패
			return false;
		}
	}
	
	//MemberDto 객체를 인자로 전달 받는 메소드 
	public boolean insert(MemberDto dto) {
		//위의 정보를 member 테이블에 insert 하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			//실행할 sql 문의 뼈대 구성하기
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			//sql  문을 수행할 PreparedStatement 객체의 참조값 얻어오기 
			pstmt=conn.prepareStatement(sql);
			// MemberDto 객체의 getter 메소드를 이용해서 필요한 값 얻어오기 
			String name=dto.getName();
			String addr=dto.getAddr();
			//? 에 필요한 값 바인딩하기
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			//sql  문 실행하기 
			//executeUpdate() 메소드는 변화된 row  의 갯수를 리턴한다. 
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
			return true;
		}else {//실패
			return false;
		}						
	}
	//Map 객체를 인자로 전달 받는 메소드 
	public boolean insert(Map<String, Object> map) {
		//위의 정보를 member 테이블에 insert 하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			//실행할 sql 문의 뼈대 구성하기
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(?, ?, ?)";
			//sql  문을 수행할 PreparedStatement 객체의 참조값 얻어오기 
			pstmt=conn.prepareStatement(sql);
			//Map 객체에 "num" 이라는 키값으로 저장된 int type 불러오기
			int num=(int)map.get("num");
			//Map 객체에 "name" 이라는 키값으로 저장된  String type  불러오기
			String name=(String)map.get("name");
			//Map 객체에 "addr" 이라는 키값으로 저장된 String type 불러오기
			String addr=(String)map.get("addr");
			
			//? 에 필요한 값 바인딩하기
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			//sql  문 실행하기 
			//executeUpdate() 메소드는 변화된 row  의 갯수를 리턴한다. 
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
			return true;
		}else {//실패
			return false;
		}				
	}
	
	// DB 에 회원 한명의 정보(num, name, addr)를 추가 하는 메소드
	public boolean insert(int num, String name, String addr) {
		//위의 정보를 member 테이블에 insert 하기
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			//실행할 sql 문의 뼈대 구성하기
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(?, ?, ?)";
			//sql  문을 수행할 PreparedStatement 객체의 참조값 얻어오기 
			pstmt=conn.prepareStatement(sql);
			//? 에 필요한 값 바인딩하기
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			//sql  문 실행하기 
			//executeUpdate() 메소드는 변화된 row  의 갯수를 리턴한다. 
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
			return true;
		}else {//실패
			return false;
		}		
	}
}