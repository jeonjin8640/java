package jdbcPrj04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ItemCrud{
	
	void selectItem() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String uid = "root";
		String pwd = "1234";
		
		conn = DriverManager.getConnection(url, uid, pwd);
		String sql = "SELECT * FROM items ORDER BY id DESC;";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while( rs.next() ) {//디비 -> 객체 -> 화면 출력
			Items item = new Items(); //1 -> Items.java 
			
			item.setId(rs.getInt(1));
			item.setName(rs.getString(2));
			item.setPrice(rs.getInt(3));
			item.setStock(rs.getInt(4));
			item.setDate(rs.getString(5));
			
			System.out.println(item.toString());
			
		}
		
	}
	
	
	void insertItem() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String pwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, pwd);
			
			String sql = "INSERT INTO items VALUES(null, ?, ?, ?, now());";


			
			Items item =new Items(); //임시로 값을 객체 저장
			item.setName("한돈");
			item.setPrice(1000);
			item.setStock(100);
			
			pstmt.setString(1, item.getName());//실제 디비 저장
			pstmt.setInt(2, item.getPrice());
			pstmt.setInt(3, item.getStock());
			int row = pstmt.executeUpdate();
			
			if( row > 0 ) {
				System.out.println(item.getName() +" 상품 등록이 완료 되었습니다.");
			}else {
				System.out.println("상품 등록에 실패하였습니다.\n 확인하세요.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

public class ItemsEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ItemCrud crud = new ItemCrud();
		//crud.insertItem();
		crud.selectItem();
	}

}
