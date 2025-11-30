package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//Set<String> mentorsList=new HashSet<String>(); //Random order
		//   0        1         2         3
		//[Vinoth, Harrish, Bhuvanesh, Anburaj]
		//TreeSet
		//Set<String> mentorsList=new TreeSet<String>();
		//   0           1        2        4
		//[Anburaj, Bhuvanesh, Harrish, Vinoth]
		//
		
		//LinkedHashSet
		Set<String> mentorsList=new LinkedHashSet<String>();
		//  0         1         2         3
		//[Vinoth, Bhuvanesh, Harrish, Anburaj]
		//add
		mentorsList.add("Vinoth");
		mentorsList.add("Bhuvanesh");
		mentorsList.add("Harrish");
		mentorsList.add("Anburaj");
		System.out.println("The set is : "+mentorsList);
		
		//add the duplicate values
		mentorsList.add("harrish");
		System.out.println("The Set is: "+mentorsList);
		
		//remove method
		mentorsList.remove("Harrish");
		System.out.println("The set is: "+mentorsList);
		
		int sizeOfSet = mentorsList.size();
		System.out.println("Size is: "+sizeOfSet);
		
		//addAll 
		//add all the elements from 1 List to Another List
		//add all the elements from 1 Set to Another Set
		Set<String> newSet=new HashSet<String>();
		System.out.println("The elements in Set: "+newSet);
		newSet.addAll(mentorsList);
		System.out.println("The element is: "+newSet);
		
		//get is not available for Set
		//add the elements from Set to List
		//use the get method
		
		//Declare empty List
		List<String> trainers=new ArrayList<String>(mentorsList);
        //System.out.println("The List is: "+trainers);
		String string = trainers.get(0);
		System.out.println("The element at index 0: "+string);
		
		//Declaring Set with Datatypes
		Set<Character> setName=new HashSet<Character>();
	}

}
