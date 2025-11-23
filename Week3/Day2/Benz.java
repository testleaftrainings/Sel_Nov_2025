package week3.day2;

public class Benz extends Car{
	
	public void driveFast() {
		System.out.println("driveFast");

	}
	
	public static void main(String[] args) {
		Benz benzOptions=new Benz();
		benzOptions.driveFast();
		benzOptions.applyBrake();
		benzOptions.applyHorn();
		
	}

}
//GC          Parent       GP
//Benz extends Car extends Vehicle
// 3            2             1