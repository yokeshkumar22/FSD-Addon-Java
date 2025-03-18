package programs;

public class Operators {
	
	
	public static void main(String[] args) {
	 int a = 5, b = 8;
	 //arithmetic
	 System.out.println("Addition"+(a+b));
	 System.out.println("subtraction"+(a-b));
	 System.out.println("multiplication"+(a*b));
	 
	 //relational
	 
	 System.out.println("Equal to"+(a==b));
	 System.out.println("not equal"+(a!=b));
	 System.out.println("greater than"+(a>b));
	 System.out.println("less than equal to"+(a<=b));
	 
	 //logical
	 boolean condition1 = true, condition2 =  false;
	 
	 System.out.println("logical AND "+(condition1 && condition2));
	 System.out.println("logical OR "+(condition1 || condition2));
	 System.out.println("logical NOT "+(!condition1));	
	 
	 //unary 
	 
	 System.out.println("unary negation: "+(~a));
	 System.out.println("unary negation: "+(~b));
	 System.out.println("post increment: "+(a++));
	 System.out.println("pre increment: "+(--b));

	 
	 //assingment
	 
	 a+=5; //a=a+5
	 System.out.println("+=: "+a);
	 
	 //ternary
	 String res = (a>b)?"a is greater" : "b is greater";
	 System.out.println("result:" + res);
	 
	 //Bitwise
	 /***
	  * AND-->&
	  * OR-->|
	  * NNOT-->~
	  * XOR-->^
	  */
	 
	 
	}

}
