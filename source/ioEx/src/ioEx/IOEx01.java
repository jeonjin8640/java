package ioEx;

import java.io.File;

public class IOEx01 {

	public static void main(String[] args) {
		//사원가입(이미지), 게시판(이미지, 첨부파일) : 오늘 첨부파일
		//입사일 : 년월일 폴더
		
		
		try {
			///구현 코드
			String file = "c:\\temp\\koreait.txt";
			File makeFile = new File(file);
			makeFile.createNewFile();
			
		}catch(Exception e ) {//여러 개 작성 가능
			e.printStackTrace();
			System.out.println("파일 생성에 예외가 발생했습니다.");
		}finally {
			
		}
		
		
		
		
		//파일 생성
		//경로 구분자 (seperator)
		// /
		
		String file = "c:\\temp\\koreait.txt";
		File makeFile = new File(file);
		
	}

}
