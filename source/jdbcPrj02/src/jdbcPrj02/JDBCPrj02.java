package jdbcPrj02;

import java.sql.*;

public class JDBCPrj02 {

	public static void main(String[] args) {
		JDBCPrj02 jdbc = new JDBCPrj02();
		jdbc.insertDB();
	}

	public void insertDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			//정상적으로 연결 된다면 Connection 객체로 받아주기
			Connection conn = DriverManager.getConnection(url, id, pwd);
			//System.out.println("성공...");
			//conn : 데이터베이스에 연결되었으니까...
			String sql = "INSERT INTO register VALUES(102, '이영희', '2222');";
			
			//위 변수에 저장된 쿼리를 실행하는 createStatement() 객체 사용
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("회원가입이 완료 되었습니다.");
			
			
			
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패...");
		}
	}
	
	
	
}
