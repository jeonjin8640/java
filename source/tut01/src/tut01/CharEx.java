package tut01;

public class CharEx {

	public static void main(String[] args) {
//		데이터타입 변수명 = 값;
		char c = 'a';
		String str = "b";
		int ch = 'a';
		
		System.out.println(c);
		System.out.println(str);
		System.out.println( (char)(ch + 1));
		
		System.out.println("-------------------");
		
		//회원가입 했을 때 저장된 아이디, 비밀번호
		String userid = "idea";
		String passwd = "12345";
		
		//내가 지금 입력하는 아이디, 비밀번호
		String userid2 = "ideaa";
		String passwd2 = "6789";
		
		//값이 같냐 다르냐 A.equals("B") A와 B의 값이 같으면
		
		//확인 => if -> 맞으면 로그인되었습니다. 다시 로그인해 주세요
		
		//if(조건) {//회원 = 입력
		//	출력
		//}
		//userid.equals(userid2)
		if( userid.equals(userid2) ) {// 맞는 값
			System.out.println("로그인 되었습니다.");
		}else {//틀린 값
			System.out.println("가입된 회원이 아닙니다.\n회원가입해 주세요.");
		}
		
		
		System.out.println("------------------------------");
		
	}

}
