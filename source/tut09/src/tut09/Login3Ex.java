package tut09;





public class Login3Ex {

	public static void main(String[] args) {
		Login3 log = new Login3(); //생성자 실행하는 순간에 필드에 있는 시간 출력
		log.setEmail("korea");
		log.setPasswd("1234");
		
		System.out.println("----Getter 출력-----");
		System.out.println( log.getEmail());
		System.out.println( log.getPasswd());
		System.out.println( log.getRegist());
		
		System.out.println("-----메소드 출력-----");
		System.out.println(log.toString());
		
	}

}
