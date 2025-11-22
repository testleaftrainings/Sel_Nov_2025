package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		
		// String Literal
		String str1="TestLeaf";
		
		//String Instantiation
		String str2=new String("TestLeaf");
		
		String str3="TestLeaf";
		
		String str4=new String("TestLeaf");
		
		// ==     -  reference address of 2 Strings
		//.equals -  values of 2 String
		
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println(str2==str4);
		
		System.out.println(str1.equals(str2));
		
		System.out.println("------------------");
		
		
		String batchName="Selenium Nov";
		
		//To find the length of String-count the number of Characters  -->length
		int lengthOfString = batchName.length();
		System.out.println("The Length is: "+lengthOfString);
		
		//contains vs equals
		System.out.println(batchName.contains("nov"));
		
		//ignore the case
		System.out.println(batchName.equalsIgnoreCase("SELeNiUm NOv"));
		
		//upperCase-Convert string into uppercase
		//input=Selenium Nov
		//output=SELENIUM NOV
		String upperCase = batchName.toUpperCase();
		System.out.println(upperCase);
		
	    String batch="Selenium";
		
		//toCharArray - Converts String a Character Array
		//  0   1   2   3   4   5   6   7
		//{'S','e','l','e','n','i','u','m'}
		char[] character = batch.toCharArray();
		System.out.println(character[2]);
		
		//index              012345
		String nameOfPerson="Rajesh";
		
		
		//charAt  - retrieve a char at particular index in a String
		char charAt2 = nameOfPerson.charAt(2);
		System.out.println(charAt2);
		
		//subString-crop a String into a smaller String
		//input-String
		//                   01234567
		String currentBatch="Selenium";
		
		String substring = currentBatch.substring(3);
		System.out.println(substring);
		
		String substring2 = currentBatch.substring(2, 4);
		System.out.println(substring2);
		
		//split-Split the String into multiple Strings
		
		String bat="Sel Nov 2025";
		//    0        1
		//{"Sel N","v 2025"}
		//  0       1       2
		//{"Sel", "Nov", "2025"}
		String[] split = bat.split("o");
		System.out.println(split[1]);
		
		String rupee="1000$";
		int amount=100;
		System.out.println(rupee+amount);  //1000$100
		
		//replaceAll
		String replaceAll = rupee.replaceAll("[$]", "");
		System.out.println(replaceAll);
		
		//Convert the String into int
		int finalRupee = Integer.parseInt(replaceAll);
	    System.out.println(finalRupee+amount);
	}

}
