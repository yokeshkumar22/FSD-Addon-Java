package Session3;

import java.util.Scanner;

public class Nestedforlooop {

	public static void main(String[] args) {
		
		
//		for(int i = 1; i<=5 ; i++) {//i = 1
//		
//		
//	for(int j = 1; j<=7; j++) {//j=1 to 4//4times itreation happens
//		
//		System.out.print("  "+i);
//		
//	}
//	
//	
//	System.out.println();
//	}
		
//DIAMOND MAPPI
		
		Scanner sc = new Scanner(System.in);
		
		//no.of rows by user to give for pattern printing
		System.out.println("Enter no. of rows:");
		
		int rows = sc.nextInt();
		
		//Top half of diamond
		for(int i = 1; i<=rows; i++) {
			//leading spaces
			for(int j = i; j<rows ; j++) {
				
				System.out.print(" ");
			}
			//print *
			for(int k = 1; k<=(2*i-1); k++) {
				
				System.out.print("*");
		
			}
			
			System.out.println();
		}
	
		//BOTTOM half of diamond
				for(int i = rows-1; i>=1; i--) {
					//leading spaces
					for(int j = rows; j>i ; j--) {
						
						System.out.print(" ");
					}
					//print *
					for(int k = 1; k<=(2*i-1); k++) {
						
						System.out.print("*");
					}
					System.out.println();
				}

		
		
		
		
		
	}
	
}
