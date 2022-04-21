package Day_2;

public class Swap {
	
	public static void main (String [] args) {
		int a = 10 ;
		int b =20;
		
		swap(a,b);
		
		System.out.println(a+""+b);
	}
	
	
	// in java there is no concept of pass by reference there is only pass by value that is it will sent a copy of values  
	public static void swap(int a , int b ) {
		int temp =a ;
		a=b;
		b=temp;
		
	}
}
