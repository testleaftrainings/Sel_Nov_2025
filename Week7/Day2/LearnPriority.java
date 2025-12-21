package week7.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	
	//Negative      -3    -2   -1
	//Default        0
	//createAccount   //1 
	
	//sendMessage     //2
	
	//deleteAccount   //3
	
	@Test()
	public void deleteAccount() {
		System.out.println("deleteAccount");

	}
	
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("createAccount");

	}
	
	@Test(priority = 2)
	public void sendMessage() {
		System.out.println("sendMessage");

	}
	
	

}
