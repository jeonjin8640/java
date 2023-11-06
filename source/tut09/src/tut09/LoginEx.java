package tut09;


public class LoginEx {
	
	
	public static void main(String[] args) {
		Login2 web = new Login2();
		web.userid = "aaa";
		web.passwd = "1234";
		web.age = 10;
		System.out.println("아이디는 "+web.userid+"입니다.");
		System.out.println("비밀번호는 "+web.passwd+"입니다.");
		System.out.println("나이는 "+web.age+"입니다.");
		
		System.out.println("-------------------");
		
		Login2 grp = new Login2();
		grp.userid = "bbb";
		grp.passwd = "123";
		grp.age = -10;
		System.out.println("아이디는"+grp.userid+"\t, "
				+ "비밀번호는 "+grp.passwd+"\t,나이는 "+grp.age+"\t입니다.");
	}

}
