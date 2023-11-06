package tut008;

public class HelloEx {
	
	
	//매개변수는 있을 수도 있고 없을 수도
	//public(아무나)   private(나만 : 캡슐화)
	//sysout(리턴타입->void), sysout(타입)
		/*접근제한자 리턴타입(viod) 메소드명(매개변수){
			return 변수명;
			}
		 */ 

	public void title(String str) {
		//부산 Koreait 아카데미
		//서울 Koreait 아케데미
		//광주 Koreait 아카데미
		System.out.println(str+"Koreait Academy");
	}
	
	public void info(String tel, String addr) {
		System.out.println("전화번호 : "+tel+"");
		System.out.println("주소 : "+addr+"");
		System.out.println("이메일 : ");
		
	}
	
	public static void main(String[] args) {
		//HelloEx 클래스 안의 내용 전체를 가져 온다
		HelloEx busan = new HelloEx();
		busan.title("부산");
		busan.info("051-123-4567", "부산광역시");
		busan.title("부산");
		
		//코리아아이티 아카데미
		//전화번호, 주소
		//코리아아이티 아카데미
		
		System.out.println("--------------------");
		
		
		HelloEx seoul = new HelloEx();
		seoul.title("서울");
		seoul.info("02-123-4567", "서울특별시");
		seoul.title("서울");
		
		System.out.println("---------------------");
		
		HelloEx gwangju = new HelloEx();
		gwangju.title("광주");
		gwangju.info("063-123-4567", "광주광역시");
		gwangju.title("광주");
		
	}

}
