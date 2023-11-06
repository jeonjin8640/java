package tut03;

public class StringEx3 {

	public static void main(String[] args) {
		
		//같은 타입을 이름 하나로 많은 데이터를 다루기 위해 필요 - 배열[] + for
		//다른 타입을 다루기 위해서는 객체를 사용 - for
		
		//소문자 -> 대문자
		//값.toUpperCase();
		//대괄호[]가 붙는게 배열
		String title = "korea it academy";
		System.out.println( title.toUpperCase());
		
		System.out.println("-------------------------");
		
		String menus = "Home:Company:Contact:Help";
		
//		System.out.println(menus.split(":"));
		String[] s = menus.split(":");

		System.out.print(s[0]);
		System.out.print(s[1]);
		System.out.print(s[2]);
		
System.out.println("");
//		for(int i = 0; i < 배열명.length; i++) {
//			출력코드
//		}
		
		
		//for(데이더타입 별명 : 배열이름) {   //천번을 적어야할 경우 하나씩 다 못적으니까 for사용
		//	출력코드
		//}
		for(String result : s)
			System.out.print(result);
		
System.out.println("");

		System.out.println(s.length);
		
		System.out.println("-------------------");
		
		//정수 생성 후 초기값은 100
		//출력 : 생성된 변수의 초기값은 100입니다.
		int num = 100;
		System.out.println("초기값은 " + num + "입니다.");
		
		
		System.out.printf("생성된 변수의 초기값은 %d 입니다.", num );
System.out.println();
		
//		2진수 -> binary => 01010101
//		8진수 -> Oct => 01 010 101
//		16진수 -> hex => 0101 0101 -> 0~9, a(10) b(11) c d e f(15)
//		10진수 -> dec
		
		String str = "부산";
		System.out.printf("내가 사는 곳은 %s입니다.", str);
		
	}

}
