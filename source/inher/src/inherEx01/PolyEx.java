package inherEx01;

class OSystem {
	void run(){ //운영체제 실행 메소드
	System.out.println("운영체제를 시작합니다.");
	}
}

class LinuxEx extends OSystem{

	@Override
	void run() {
		System.out.println("Linux 운영체제를 시작합니다.");
	}
}class OsStart{
	//부모(os)는 자식(lnux, apple, ms) 다 포함(담을) 수 있다
		void start(OSystem os) {
			os.run();
}
	
	
}

class AppleEx extends OSystem{
	@Override
	void run() {
		System.out.println("Apple 운영체제를 시작합니다.");
}
}
class MicrosoftEx extends OSystem{
	@Override
	void run() {
		System.out.println("MS 운영체제를 시작합니다.");
}
}

public class PolyEx {

	public static void main(String[] args) {
//		LinuxEx linux = new LinuxEx();
//		linux.run();
//		System.out.println("------------------");
//		
//		AppleEx apple = new AppleEx();
//		apple.run();
//		System.out.println("------------------");
//		
//		MicrosoftEx micro = new MicrosoftEx();
//		micro.run();
		
		OsStart boot = new OsStart();
		boot.start(new LinuxEx());
		boot.start(new AppleEx());
		boot.start(new MicrosoftEx());
	}

}
