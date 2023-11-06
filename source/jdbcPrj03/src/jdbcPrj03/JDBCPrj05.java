package jdbcPrj03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class UpdateDao{
	
	void updateDB() {
		try {
			Connection conn = null;
			Statement stmt = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/grp";
			String uid = "root";
			String pwd = "1234";
			
			//접속정보
			conn = DriverManager.getConnection(url, uid, pwd);
			
			String sql = "UPDATE member SET com_name = '공유철' WHERE com_id = 5";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("정보가 수정되었습니다.");
			}else {
				System.out.println("관리자에게 문의하세요.");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("연결실패");
		}
	}
}


class DeleteDao{
	
	void deleteDB() {
		
		try {
			Connection conn = null;
			Statement stmt = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/grp";
			String uid = "root";
			String pwd = "1234";
			
			//접속정보
			conn = DriverManager.getConnection(url, uid, pwd);
			String sql = "DELETE FROM member WHERE com_id = 5";
			stmt = conn.createStatement();
			int row = stmt.executeUpdate(sql);
			
			if( row > 0 ) {
				System.out.println("사원 정보가 삭제 되었습니다.");
			}else {
				System.out.println("삭제할 수 없습니다.\n관리자에게 문의하세요.");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("관리자에게 문의하세요");
		}
	}
}

public class JDBCPrj05 {

	public static void main(String[] args) {
//		UpdateDao dao = new UpdateDao();
//		dao.updateDB();
		DeleteDao dao = new DeleteDao();
		dao.deleteDB();
		
		
	}

}
