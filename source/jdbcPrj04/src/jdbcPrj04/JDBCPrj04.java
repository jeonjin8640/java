package jdbcPrj04;

import java.sql.*;
import java.util.concurrent.ExecutionException;

class InsertDao {
	
	void selectDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd);
			
			String sql = "SELECT * FROM items ORDER BY id DESC";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + " "); //=> System.out.println(rs.getInt(id));
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getInt(3) + " ");
				System.out.print(rs.getInt(4) + " ");
				System.out.print(rs.getDate(5));
				System.out.println("");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	void insertDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd);
			
			String sql = "INSERT INTO items VALUES(null, ?, ?, ?, now());";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "컴퓨터 모니터");
			pstmt.setInt(2, 10000);
			pstmt.setInt(3, 100);
			
			int row = pstmt.executeUpdate();
			if( row > 0 ) {
				System.out.println(row);
				System.out.println("상품등록이 완료되었습니다.");
			
			}else {
				System.out.println(row);
				System.out.println("관리자에게 문의하세요.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}


public class JDBCPrj04 {

	public static void main(String[] args) {
		InsertDao dao = new InsertDao();
		//dao.insertDB();
		dao.selectDB();
	}

}
