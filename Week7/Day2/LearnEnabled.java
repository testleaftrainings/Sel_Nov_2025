package week7.day2;

import org.testng.annotations.Test;

public class LearnEnabled {

	@Test(priority = 3)
	public void deleteAccount() {
		System.out.println("deleteAccount");

	}
	
	@Test(priority = 1)
	public void createAccount() {
		System.out.println("createAccount");

	}
	
	@Test(priority = 2,enabled=false)
	public void sendMessage() {
		System.out.println("sendMessage");

	}

}
