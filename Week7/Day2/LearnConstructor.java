package week7.day2;

public class LearnConstructor {

	//Special method in java
	//Name of the Constructor should be same as Class name
	//It will not not have any return type
	//It will initialize the object
	//2 type:
	//Default Constructor
	//Paramaterized Constructor
	
	int number;
	String name;
	
	public LearnConstructor() {
		System.out.println("It is default");
	}
	                       //     7           Vineeth
	public LearnConstructor(int number,String name) {
		//this();
		//System.out.println(number+ " " +name);
		this.number=number;
		//         =7 
		this.name=name;
		//         Vineeth
	}
	
	public static void main(String[] args) {
		LearnConstructor lc=new LearnConstructor();
		LearnConstructor lcp=new LearnConstructor(7, "Vineeth");
		System.out.println(lcp.name);
		System.out.println(lcp.number);
		

	}

}
