package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Operators- symbol to perform task
		
		//2 numbers add  sub  mul   d
        //Assignment operator
		//Arithmetic Operator
		//Comparison Operator
		//Logical Operator
		//Increment/Decrement
		
		//Assignment operator (=)
		int a=10;
		
		//Arithmetic Operator 
		int b=7;
		int c=2;
		
		//addition (+)
		System.out.println(b+c);
		
		//subraction
		System.out.println(b-c);
		
		//Multiplication (*)
		System.out.println(b*c);
		
		//Division 
		//Quotient   /
		System.out.println(b/c);
		//Remainder  %
		System.out.println(b%c);
		
		//Comparison Operator  -Compare 2 values
		
		int p=3;
		int q=4;
		//equalTo  (==)
		System.out.println(p==q);
		
		//p is lessThan q
		System.out.println(p<q);
		
		//p is greaterThan q    >
		System.out.println(p>q);
		// p is lessThanOrEqualTo q     <=    p<q      p==q
		System.out.println(p<=q);
		
		
		// p is greaterThanOrEqualTo q   >=    p>q     p==q
		System.out.println(p>=q);
		
		// p is notEqualTo q
		System.out.println(p!=q);
		
		System.out.println("-------------------------------");
		
		int s=10;
		int v=20;
		//Logical Operator - Compare 2 conditions
		//And operator   && Compare 2 conditions   -->Condition1 and Condition2 - true
		//Or operator    || Compare 2 conditions   -->Condition1  or Condition2 - true
		
		//And
		System.out.println(s<v&&s==v);    //             10<20   and  10==20
		
		//Or
		System.out.println(s<v||s==v);    //             10<20   or  10==20
		
		int d=7;
		
		//Increment/Decrement
		//Increment ++    -Increase the value of d by 1
		
		//postIncrement   d++  -Increased in next iteration
		System.out.println(d++);    //7
		//d++;
		System.out.println(d);      //8
		
		
		//preIncrement    ++d Increased in current iteration
		System.out.println(++d);     //9
		
		//Decrement -Decrease the value of d by 1    --
		//postDecrement  - Decreased in next iteration
		System.out.println(d--);    //   9
		
		System.out.println(d);      //   8
		
		//preDecrement  Decreased in current iteration
		System.out.println(--d);   //    7
		
		
		
		int m=7;
		
		
		System.out.println(m++);    //7
		System.out.println(m);
		System.out.println(--m);    //7
		System.out.println(++m);    //8
		
		
		
		
		
		
		
	}

}
