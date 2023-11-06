package inherEx01;

class Add{
	String title = "계산기 프로그램";
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//정수 + 정수 = 정수
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
}

class Desktop extends Add{
	
	
	public void Os() {
		System.out.println("Windows Ver 11...");
	}
}

class Laptop extends Add{
	
	public void Os() {
		System.out.println("Ios Ver 17...");
}
}
public class InherEx01 {

	public static void main(String[] args) {
		//객체 => 상속 => 프로그램 확장(회원가입 -> 게시판 -> 다중 -> 일정...)
		Desktop d = new Desktop();
		
		System.out.println("데스크탑 컴퓨터");
		d.title = "코리아이이티 계산기";
		d.turnOn();
		d.Os();
		System.out.println(d.title);
		System.out.println(d.add(100, 200));
		d.turnOff();
		
		System.out.println("----------------------------");
		
		Laptop lap = new Laptop();
		lap.turnOn();
		lap.Os();
		System.out.println(lap.title);
		System.out.println(lap.add(200, 300));
		lap.turnOff();
		
		
	}

}
