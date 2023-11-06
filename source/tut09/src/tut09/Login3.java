package tut09;

import java.time.LocalDateTime;

public class Login3 {

	//필드
	private String email;
	private String passwd;
	private LocalDateTime regist = LocalDateTime.now();
	
	//생성자
	public Login3() {
		System.out.println("로그인 정보를 출력합니다.");
	}
	
	//getter, setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public LocalDateTime getRegist() {
		return regist;
	}
	//메소드
	@Override
	public String toString() {
		return "로그인 정보를 출력합니다. [이메일=" + email + ", "
				                   + "비밀번호=" + passwd + ", "
						           + "로그인시간=" + regist + "]";
}
}