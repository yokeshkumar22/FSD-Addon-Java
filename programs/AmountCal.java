package programs;

import java.util.Scanner;

public class AmountCal {
	public static void main(String[] args) {
		int amt1, amt2, res;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amt1:");
		amt1 = sc.nextInt();
		System.out.println("eneter amt2:");
		amt2 = sc.nextInt();
		
		res = amt1 + amt2;
		
		if(res<50) {
			System.out.println("result is less then 50");
		}
		else
		{
			System.out.println("result is great then 5040");
		}
	
	}

}
