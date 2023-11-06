package inherEx01;

public class InherEx04 {

	public static void main(String[] args) {
		//Use the generator to save and output models, colors
		Phone p = new Phone("KT", "Black");
		p.turnOn();
		p.disp();
		p.turnOff();
		
		System.out.println("---------------------");
		//Android.java
		//model, color, company -> generator
		
		Android ad = new Android("Galaxy","Silver", "SAMSUNG");
		ad.disp();
	} 

}
