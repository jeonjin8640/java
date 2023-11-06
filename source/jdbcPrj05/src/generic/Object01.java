package generic;

class Fruit2 {
	void fruit2() {
		System.out.println("과일입니다.");
	}
}

class Pencil2 {
	void pencil2() {
		System.out.println("연필입니다.");
	}
}


class Box{
	
	//저장시 문제가 없음, 출력시 형변환이 필요
	private Object obj; //어떤 객체가 들어오든지 다 저장이 가능

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
	
}



public class Object01 {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Fruit2());
		Fruit2 f2 = (Fruit2) box.getObj();
		System.out.println( f2 );

		System.out.println("--------------------------");
		
		Box box2 = new Box();
		box2.setObj(new Pencil2());
		Pencil2 p2 = (Pencil2) box2.getObj();
		System.out.println( p2 );
		
		
		Object str = "korait";
		String s = (String) str;
		System.out.println(s);
		
		Object i = 100;
		Integer num = (Integer) i;
		System.out.println(num);
		
	}

}
