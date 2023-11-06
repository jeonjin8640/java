package singleton;

class SingletonTest {
	private static SingletonTest st = new SingletonTest();
	private SingletonTest() {}

	public static SingletonTest getInstance() {
		return st;
	}
	
	//공유해서 사용할 메소드-------------------------------------
}



public class SingletonEx01 {

	public static void main(String[] args) {
		SingletonTest.getInstance();
		
	}

}
