package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Declare a List
		List<String> learnersList=new ArrayList<String>();
		System.out.println("The List is: "+learnersList);
		//methods in a List
		
		//add an element inside a List
		learnersList.add("Rajesh");
		System.out.println("The List is: "+learnersList);
		
		//add more elements
		learnersList.add("Bharath");
		learnersList.add("Maha");
		System.out.println("The List is: "+learnersList);
		
		//   0        1       2        3
		//[Rajesh, Aravinth,Bharath, Maha]
		
		
		//add using index
		learnersList.add(1, "Aravinth");
		System.out.println("The List is: "+learnersList);
		
		//add duplicate
		learnersList.add("Bharath");
		System.out.println("The List after adding duplicate: "+learnersList);
		
		
		//remove an element
		learnersList.remove(2);
		System.out.println("The List is: "+learnersList);

		//Arrange the List in Ascending, ASCII - sort
		Collections.sort(learnersList);
		System.out.println("The List is: "+learnersList);
		
		//    0         1       2     3
		//[Aravinth, Bharath, Maha, Rajesh]
		
		//To retreive a particular element from List - get
		String elementAtIndex1 = learnersList.get(2);
		System.out.println("The element is: "+elementAtIndex1);
		
		//To count the number of Elements
		int sizeOfList = learnersList.size();
		System.out.println(sizeOfList);
		
		//To clear all the elements in the List
		learnersList.clear();
		System.out.println("The List is: "+learnersList);
	}

}
