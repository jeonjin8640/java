package ioEx;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEx03 {

	public static void main(String[] args) throws IOException {
		//k(1) o(1) r e a i t
		String filename = "c:\\temp\\koreait.txt";
		InputStream is = new FileInputStream(filename); //파일 내용을 읽어올 준비
		
		//is.read(); 1byte
		/*while(true) {
			int result = is.read(); //글자를 byte로 읽어오지만 정수로 처리
			
			if(result == -1) //더 이상 읽을 값이 없으면 -1 return
				break;//제일 가까운 반복문 탈출
			
			System.out.print( (char)result );
			System.out.println("남은 byte(s)는 " + is.available() + "byte(s) 입니다.");
			
		}
		*/
		
		int result = 0;
		while( ( result = is.read() ) != -1 )  {
			System.out.print(result + " > ");
			System.out.println( (char)result );
		}
		
		is.close();
	}

}
