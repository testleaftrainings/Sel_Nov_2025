package week2.day1;

public class Iphone {

	public void takePhoto() {
		System.out.println("Take Photo");

	}

	public void makeCall() {
		System.out.println("Make call");
	}

	public static void main(String[] args) {
		
		// ClassName objectName=new ClassName();
		Iphone iphoneOptions = new Iphone();
		iphoneOptions.takePhoto();
		iphoneOptions.makeCall();

	}
}
