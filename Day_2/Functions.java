package Day_2;

import java.util.Scanner;

public class Functions {
	
	public static void main(String [] args)
	{
		
		int ans =sum();
		System.out.println(ans);
		
	}
	
	
	public static int sum() {
		Scanner sc = new Scanner (System.in);
		int num1, num2 , sum ;
		System.out.println("Enter number 1");
		num1 = sc.nextInt();
		System.out.println("Enter number 2");
		num2 = sc.nextInt();
		
		sum = num1 + num2 ;
		sc.close();
		return sum;
		
	}
}
