package lamda;

interface Cals {
	//람다식은 일반적으로 인터페이스 안에 메소드 1개만 생성 후 사용
	void dispNum(int num);
}


public class LamdaEx2 {

	public static void main(String[] args) {
		
		
		Cals c = (num) -> {
			System.out.println(num);
		};
		c.dispNum(1000);
		
		System.out.println("----곱하기 * 10----");
		
		Cals c2 = (x) -> {
			System.out.println(x * 10);
		};
		c2.dispNum(10);
		
		System.out.println("----더하기 + 10----");
		
		Cals c3 = (a) -> {
			int sum = a + 10;
			System.out.println(sum);
		};
		c3.dispNum(100);
		
		
		System.out.println("----return으로 출력----");
		
	}

}
