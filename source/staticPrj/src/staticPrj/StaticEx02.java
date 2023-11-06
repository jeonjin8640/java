package staticPrj;

class Login {
	static int point = 1000;
	String userid;
	String passwd;
	
	public Login(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
		//point = point + 100;
		if( userid.equals("koreait") && passwd.equals("1234")) {
			System.out.println("로그인");
			point += 100;
		}else {
			System.out.println("로그인확인필요");
			point += 0;
		}

	}
	

@Override
	public String toString() {
		return "Login [point=" + point + ", userid=" + userid + ", passwd=" + passwd + "]";
	}
}


class Shop{
	static int number = 100;
	String userid;
	String passwd;

	//아이디,비번을 생성자에 입력하면 number가 자동으로 1씩 증가
public Shop(String userid, String passwd) {
	this.userid = userid;
	this.passwd = passwd;
	++number;
}

@Override
public String toString() {
	return "Shop [number=" + number + ", userid=" + userid + ", passwd=" + passwd + "]";
}

}


public class StaticEx02 {

	public static void main(String[] args) {
		Shop s = new Shop("koreait", "1234");
		System.out.println(s.toString());
	
		System.out.println("------------------------------------------------");
		
		Shop s2 = new Shop("busanit", "1111");
		System.out.println(s.toString());
		
		System.out.println("-------------------------------------------------");
		
		Shop s3 = new Shop("seoulit", "2222");
		System.out.println(s.toString());
	}
}

