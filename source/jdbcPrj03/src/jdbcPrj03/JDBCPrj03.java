package jdbcPrj03;

import java.sql.*;

//동작을 별도 클래스 작업
class DBDao {
	void insertDB() throws ClassNotFoundException, SQLException {// i/o
		/*
		1. 연결 - Connection 객체
		2. 퀴리실행 : Statement
		3. 결과 출력 : ResultSet
		*/
		Connection conn = null;
		Statement stmt = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/grp";
		String uid = "root";
		String pwd = "1234";
		
		conn = DriverManager.getConnection(url, uid, pwd);
		//System.out.println("연결");
		stmt = conn.createStatement(); //쿼리 실행하기 위한 사전 작업
		String sql = "insert into member values(null, '이영희', now(), now());";
		stmt.execute(sql);
		System.out.println("Insert Completed...");
		
	}
}


public class JDBCPrj03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBDao db = new DBDao();
		db.insertDB();
	}

}
