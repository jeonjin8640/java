package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StreamEx01 {

	public static void main(String[] args) throws IOException {
		/*
		입출력
		1. 1byte : 텍스트, 파일, 이미지
		   (1) OutputStream/InputStream
		   			쓰기			읽기
		   	
		2. char :텍스트 전용
		
		버퍼, 캐시 메모리(L1, L2) => 속도 향상 목적 
		
		자료
		버퍼 비움(flush)
		close
		*/
		
		//파일 생성
		String filename = "koreait.txt";
		File f = new File("c:\\temp\\" + filename); //준비
		
		//파일+글쓰기 : OutputStream = FileOutputStream
		
		
		OutputStream os = new FileOutputStream(f);
		os.write('K');
		os.write('o');
		os.write('r');
		os.write('e');
		os.write('a');
		os.write('i');
		os.write('t');
		
		os.flush();
		os.close();
		
	}

}
