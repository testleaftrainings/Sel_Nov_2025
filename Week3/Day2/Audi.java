package week3.day2;

import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Audi extends Car {
	
	//Java Example for Inheritance
	//Integer extends Number
	
	//Selenium
	//ChromeDriver extends ChromiumDriver extends RemoteWebDriver
	
	public void driveWithControl() {
		System.out.println("driveWithControl");

	}
	
	public static void main(String[] args) {
		Audi audiOptions=new Audi();
		audiOptions.driveWithControl();
		audiOptions.applyBrake();
		audiOptions.applyHorn();
	}

}
//Audi extends Car extends Vehicle
//  3           2             1