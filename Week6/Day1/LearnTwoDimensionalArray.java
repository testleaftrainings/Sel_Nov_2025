package week6.day1;

public class LearnTwoDimensionalArray {

	public static void main(String[] args) {
		//                  0                               1
		//{{"Testleaf","Vineeth","Rajendran"} , {"Qeagle","Hari","R"}}
        //      0          1         2               0       1    2
	
	String arr[]=new String[5];
	String[][] data=new String[2][3];
	data[0][0]="Testleaf";
	data[0][1]="Vineeth";
	data[0][2]="Rajendran";
	
	data[1][0]="Qeagle";
	data[1][1]="Hari";
	data[1][2]="R";
	}

}
