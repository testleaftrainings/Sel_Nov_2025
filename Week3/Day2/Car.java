package week3.day2;
//         Child extends Parent
public class Car extends Vehicle {
	
	public void applyHorn() {
		System.out.println("applyHorn");

	}
	
	public static void main(String[] args) {
		Car carOptions=new Car();
		carOptions.applyHorn();
		carOptions.applyBrake();
		
	}

}
