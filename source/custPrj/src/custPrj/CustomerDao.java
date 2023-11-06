package custPrj;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	CustomerDao dao = null;
	
	//연결
	Connection getConnection() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//입력
	void setCostomer() throws SQLException {
		
		dao = new CustomerDao();
		conn = dao.getConnection();//디비 연결 완료...
		
		String sql = "insert into customers values(?, ?, ?, ?, now());";
		
		pstmt = conn.prepareStatement(sql);
		
		//db에 저장하기 전에 setter에 임시 저장
		Customer c = new Customer();
		c.setId(101);
		c.setEmail("mail@mail.com");
		c.setName("홍길동");
		c.setSalays(10000);
		
		pstmt.setInt(1, c.getId());
		pstmt.setString(2, c.getEmail());
		pstmt.setString(3, c.getName());
		pstmt.setInt(4, c.getSalays());
		
		int row = pstmt.executeUpdate();
		if( row > 0	) {
			System.out.println("동록이 완료");
		}
	}
	
	//출력
	List<Customer> getCustomers() throws SQLException {
		//Collections 이용
		//빈줄, 빈칸 -> 값 삽입 -> 객체.add();
		List<Customer> list = new ArrayList<>();
		
		dao = new CustomerDao();
		conn = dao.getConnection();//디비 연결 완료...
		
		String sql = "select * from customers order by id desc;";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while( rs.next() ) {
			Customer cu = new Customer();
			
			cu.setId(rs.getInt(1));
			cu.setEmail(rs.getString(2));
			cu.setName(rs.getString(3));
			cu.setSalays(rs.getInt(4));
			cu.setRegdate(rs.getString(5));
			
			list.add(cu);//list 3줄
			
		}
		
		return list;
	}
	
	
}
