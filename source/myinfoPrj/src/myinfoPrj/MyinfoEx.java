package myinfoPrj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Myinfo {
	private String userid;
	private String passwd;
	private int age;
	
	
	public Myinfo() {}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPasswd() {
		return passwd;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Myinfo [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
	
	
}

class InsertDB{
	
	void selectQuery() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pwd);
		
		String query = "select * from myinfo order by userid asc";
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery();
		while( rs.next() ) {
			//System.out.println("아이디: "+rs.getString(1)+", 비밀번호 : "+rs.getString(2)+", 나이 : "+rs.getInt(3)+" ");
			Myinfo m = new Myinfo();
			m.setUserid(rs.getString(1));
			m.setPasswd(rs.getString(2)); 
			m.setAge(rs.getInt(3));
			
			System.out.println(m.toString());
		}
		
	}
	
	
	void insertQuery() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			//System.out.println("연결");
			
			String sql = "insert into myinfo values(?, ?, ?);";
			pstmt = conn.prepareStatement(sql);
			
//			pstmt.setString(1, "koreait");  //객체가 아니라서 객체 사용하려고 주석 처리
//			pstmt.setString(2, "1234");
//			pstmt.setInt(3, 20);
			
			Myinfo my = new Myinfo();
			my.setUserid("korea");
			my.setPasswd("1234");
			my.setAge(20);
			
			pstmt.setString(1, my.getUserid());
			pstmt.setString(2, my.getPasswd());
			pstmt.setInt(3, my.getAge());
			
			int row = pstmt.executeUpdate();
			
			if( row > 0) {
				System.out.println(my.getUserid() + "님 회원가입 완료");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}


public class MyinfoEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		InsertDB db = new InsertDB();
		//db.insertQuery();
		db.selectQuery();
	}

}
