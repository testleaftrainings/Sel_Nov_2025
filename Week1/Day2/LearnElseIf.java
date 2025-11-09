package week1.day2;

public class LearnElseIf {

	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		// 20<20
		if (a<b) {
			System.out.println("a is smaller than b");
		}
		//     20>20
		else if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("a is equal to b");
		}

	}

}
