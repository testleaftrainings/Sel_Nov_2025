package week4.day1;

public class Calculator {
	
	//add, sub, multiplication, division
	
	//add
	//addNumbers
	//2 numbers
	public void addNumbers(int a, int b) {
		System.out.println(a+b);

	}
	//3 numbers
	public void addNumbers(int a, int b, int c) {
		System.out.println(a+b+c);

	}
	//2 decimals numbers
	public void addNumbers(float p, float q) {
		System.out.println(p+q);

	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addNumbers(1.5f, 2.5f);
		
		calc.addNumbers(4, 1);
	}
	

}
