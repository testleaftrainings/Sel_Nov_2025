package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		// Array Literal
		int scores[] = { 78, 90, 100, 56, 89 };

		// To find the number of data - length
		int lengthOfArray = scores.length;
		System.out.println("The length is : " + lengthOfArray);

		// To retrieve a data - index
		System.out.println(scores[2]);

		// To print all the data in Array
		// 0 1 2 3 4
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			// System.out.println(scores[0]);//78
			// System.out.println(scores[1]);//90
			// System.out.println(scores[2]);//100
			// System.out.println(scores[3]);//56
			// System.out.println(scores[4]);//89

		}

		// Sort the Array
		Arrays.sort(scores);
		
		// To print the lowest value
		System.out.println(scores[0]);

		// To print the Highest value
		System.out.println(scores[lengthOfArray - 1]);

		
		// By Instantiation
		int[] marks = new int[3];
		marks[0] = 65;
		marks[1] = 96;
		marks[2] = 78;

	}

}
