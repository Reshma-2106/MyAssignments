package Week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8; // range of number
		int a=0,b=1; // Initializing the starting value
		
		//n times the iteration will happen to print the Fibonacci series
		for (int i=0;i<n;i++) {
			System.out.println(a+" "); // Print the fibonacci number
			int c=a+b; // Sum of previous number
			a=b; // reassigning the values
			b=c;
		}
		

	}

}
