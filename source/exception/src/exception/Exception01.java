package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) throws IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //예외가 발생 부분 표시 : 개발자
			e.getMessage(); //예외 메시지
			System.out.println("404 Error : 관리자에게 문의하세요.");
		}
		
		try {
			FileInputStream fis = new FileInputStream("./koreait.txt");
			fis.read();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
			
			System.out.println("404 Error : 관리자에게 문의하세요.");
		}
		
		try {
			 System.out.println(10/0);
			
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			ae.getMessage();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		String[] str = new String[] {"a", "b", "c"};
		try {
			System.out.println( str[3] );	
		}catch(ArrayIndexOutOfBoundsException aiobe){
			aiobe.printStackTrace();
			System.out.println("인덱스 번호 예외");
		}
		
		String str1 = "Koreait";
		//String str2 = new String("Koreait");
		//글자 추출 후 char로 변경해서 출력
		//System.out.println(str1.charAt(1));
		String str3 = null;
		try {
			System.out.println(str3.charAt(0));
		}catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("데이터 값이 없습니다.");
		}
		
		
	}
}
