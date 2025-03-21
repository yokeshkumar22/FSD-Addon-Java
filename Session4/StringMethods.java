package Session4;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
//		String s1 = "java prms";
//		//1.length
//		System.out.println(s1.length());
	
		//2.equal()
//		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("Enter username:");
//		String username = sc.nextLine();
//		
//		System.out.println("Enter password:");
//		String password = sc.next();
//		
//		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123")) {
//			System.out.println("success");
//		}else {
//			System.out.println("ERROR 404");
//		}
//		
		
//		String s4 = "NPC";
//		String s5 = "NPC";		
//		
//		System.out.println(s4==s5);
		
		String name = new String("REVAN");
		String name1 = new String("REVAN");
		System.out.println(name==name1);
		
		
		//compareTO
		//s1>s2--->positive number
		//s1<s2--->negative number
		//s1==s2-->0
		
		String s6 = "HALCYONZ";
		String s7 = "XYFER";
		
		System.out.println(s6.compareTo(s7));
		
		//concat()
		String str1 = "Static";
		String str2 = new String("PROGRAM");
		System.out.println(str1.concat(str2));
		
		//toChararray()
		String str3 = "Welcome to java";
		System.out.println("Value of method");
		char[] ch= str3.toCharArray();
		for(char st:ch) {
			
			System.out.println(st);
			
			
		}
		
		
		
		
		
		System.out.println(str3.toCharArray());
		
		//substring
		System.out.println(str3.substring(3));
		System.out.println(str3.substring(0,10));
		
		//intern
		String clg = "KG";
		String clg1 = new String("KG");
		String str4 = clg1.intern();
		
		System.out.println(clg==str4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
