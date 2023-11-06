package inherEx01;

class Person{
	String name;
	int age;
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	void eat() {
		System.out.println("밥을 먹습니다.");
	}
}

class Student extends Person{
	
	String stdID;
	void study() {
		System.out.println("학생은 공부를 합니다.");
	}
}

class Employee extends Person{
	String empID;
	void work() {
		System.out.println("사원은 출근을 합니다.");
	}
}

public class InherEx03 {

	public static void main(String[] args) {
		//interface, abstract -> 객체 생성해서 사용x(new x)
		//본체({} x)
		Student s = new Student();
		s.eat();
		s.study();
		s.stdID = "A200100001";
		s.name = "홍길동";
		s.age = 19;
		s.eat();
		s.study();
		
		System.out.println("-------------------");
		
		Employee e = new Employee();
		e.eat();
		e.work();
		e.empID = "E300100002";
		e.name = "김철수";
		e.age = 20;
		e.eat();
		e.work();
		
	}

}
