package inherEx01;

public class Phone {
    String model;
	String color;
	
	public Phone() {}
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	
	void turnOn() {
		System.out.println("Turn on the power.");
	}
	
	void turnOff() {
		System.out.println("Turn off the power.");
	}
	
	void disp() {
		System.out.println("Model : "+model+", Color : "+color);
	}
}
