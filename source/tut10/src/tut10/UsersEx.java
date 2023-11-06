package tut10;



class Users{//객체 구성 요소
	//필드(멤버변수) : 공유 변수
	String userid;
	String passwd;
	int age;
	
	
	//생성자
	public Users() {}
	
	public Users(String userid, String passwd, int age) {
		
		this.userid = userid;
		this.passwd = passwd;
		this.age = age;
	}
	
	
	//캡슐화(데이터보호) 처리 : 가져오기 getter, 저장하기 setter
	public String getUserid() {
		return userid;
	}



	public void setUserid(String userid) {
		this.userid = userid;
	}



	public String getPasswd() {
		return passwd;
	}



	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	//메소드
	@Override
	public String toString() {//표준화
		return "Users [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
	
	

}


public class UsersEx {

	public static void main(String[] args) {
		//3명의 회원을 생성자로 저장 후 출력
		
		Users[] user = new Users[3];
		//3명 -> 초기화도 3번
		user[0] = new Users("a", "b", 10);
		user[1] = new Users("1", "2", 22);
		user[2] = new Users("3", "4", 55);
		
		for(int i = 0; i < 3; ++i) {
			user[i] = new Users("아이디"+i, "비번"+i, (0+i));
			System.out.println(user[i].toString());
		
		}
		
		System.out.println("--------------------------------");
		
		for(int i = 0; i < 3; ++i) {
			//set 이용해서 저장
			
			user[i] = new Users();
			user[i].setUserid("Busan");
			user[i].setPasswd("1234");
			user[i].setAge(10);
			
			System.out.println(user[i].toString());
		}
		
	}

}
