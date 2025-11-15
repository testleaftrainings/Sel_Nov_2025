package week2.day1;

public class AdditionReturnType {
	
	//return type - Output for a method/task
	//void - it will not return anything
	public int addNumbers() {
		int a=20;
		int b=30;
		int c=a+b;
		return c;
		}
	
	public static void main(String[] args) {
		AdditionReturnType options=new AdditionReturnType();
		int addition = options.addNumbers();

	}

}
