package tut01;

public class PrintEx2 {

	public static void main(String[] args) {
		//char : 문자, '', 2byte, ASCII, 숫자로 형변환이 가능(타입 캐스팅)
		char c = 'k';
		System.out.println(c);
		System.out.println((int)c);
		System.out.println((char)97);
		//boolean : true, false(따옴표 사용x)
		boolean b = false;
		
		///true면 통과, false면 실패		
	    //if와 사용 : if(
		//문자열 값이 같다는 equals() 외에는 같다는 ==
		
		if(b == false)	
			System.out.println("실패");
		else 
			System.out.println("통과");
		
		System.out.println("---------------------");
		
		boolean run = true;
		
		if( !run )  // !
			System.out.println("실패");
		else 
				System.out.println("성공");
			
		String msg = (!run) ? "성공" : "실패";
		System.out.println(msg);
		
	}

}
