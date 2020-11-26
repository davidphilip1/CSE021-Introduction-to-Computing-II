public class Lab21_5 {

	public static void init(long[] arr) {
		// Initialize all the entries of the array to 0
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}

	public static long sumAll(int max) {
		// sumAll basic version
		long subTotal = 0;
		for (int i = 1; i <= max; i++) {
			subTotal += i;
			System.out.println("sumAll " + i + " value " + subTotal);
		}
		return subTotal;
	}

	public static long sumAll(long[] arr, int max) {
		// Use the array to store sub results
		for (int i = 1; i <= max ; i++) {
			if (arr[i] == 0) {
				arr[i] = arr[i-1] + i;	
				System.out.println("sumAll[" + i + "] value " + arr[i]);
			}
		}
		return arr[max];

	}

	private static int squareSum(int i) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int k=1; k<=i;k++) {
			sum += (k*k);
			System.out.println("squareSum " + k + " value " + sum);
		}
		return sum;
	}

	private static int squareSum(long[] arr, int i) {
		// TODO Auto-generated method stub
		int j;
		for (j=1; j <= i ; j++) {
			if (arr[j] == 0) {
				arr[j] = arr[j-1] + (j*j);	 
				System.out.println("sumAll[" + j + "] value " + arr[j]);
			}
		}
		
		return (int) arr[i];

	}
	
	private static int fib(long[] arr, int i) {
		// TODO Auto-generated method stub
		arr[0]=0;
		arr[1]=1;
		for(int k=2; k<=i; k++) {
			if(arr[k] == 0) {
			arr[k] = arr[k-1]+arr[k-2];

			
			 
			
		System.out.println("Fibonacci[" + k + "] value " + arr[k]);
			}
		}
		return (int) arr[i];
	}

	private static int fib(int i) {
		// TODO Auto-generated method stub
		int fib=0;
		
		int temp1=0;
		int temp2=1;
		

		
		for(int k = 2; k<=i; k++) {
			
			 fib = temp1+temp2;
			 temp1=temp2;
			 temp2=fib;
			 
			 
			System.out.println("Fibonacci " + k + " value " + fib);
		}
		return fib;
	}
	
	private static long factorial(int i) {
		// TODO Auto-generated method stub
		long mult = 1;
		
		for(int k=2;k<=i; k++ ) {	
			mult = k* mult;
			System.out.println("Factorial " + k + " value " + mult);
			}
		return  mult;
	}

	private static long factorial(long[] arr, int i) {
		// TODO Auto-generated method stub
		
		long mult =1;
		for(int k=2; k<=i; k++) {
			if(arr[k]==0) {
				
				mult = k*mult;
				System.out.println("Factorial[" + k +"] value " + mult);
			}
		}
		return mult;
	}


	// Fill-in the appropriate methods to complete the lab

	public static void main(String[] args) {

		final int MAXSIZE = 100;
		long[] arr = new long[MAXSIZE];

		System.out.println("sumAll output for 5 is " + sumAll(5));
		System.out.println("sumAll output for 10 is " + sumAll(10));
		System.out.println("sumAll output for 20 is " + sumAll(20));
		System.out.println("sumAll output for 15 is " + sumAll(15));
		System.out.println();

		init(arr); //resets array
		System.out.println("sumAll output for 5 is " + sumAll(arr, 5));
		System.out.println("sumAll output for 10 is " + sumAll(arr, 10));
		System.out.println("sumAll output for 20 is " + sumAll(arr, 20));
		System.out.println("sumAll output for 15 is " + sumAll(arr, 15));
		System.out.println();


		System.out.println("squareSum output for 5 is " + squareSum(5));
		System.out.println("squareSum output for 10 is " + squareSum(10));
		System.out.println("squareSum output for 20 is " + squareSum(20));
		System.out.println("squareSum output for 15 is " + squareSum(15));
		System.out.println();

		init(arr);
		System.out.println("squareSum output for 5 is " + squareSum(arr, 5));
		System.out.println("squareSum output for 10 is " + squareSum(arr, 10));
		System.out.println("squareSum output for 20 is " + squareSum(arr, 20));
		System.out.println("squareSum output for 15 is " + squareSum(arr, 15));
		System.out.println();
		
		System.out.println("Fibonacci Number 5 is " + fib(5));
		System.out.println("Fibonacci Number 10 is " + fib(10));
		System.out.println("Fibonacci Number 20 is " + fib(20));
		System.out.println("Fibonacci Number 15 is " + fib(15));
		System.out.println();
		
		init(arr);
		System.out.println("Fibonacci Number 5 is " + fib(arr, 5));
		System.out.println("Fibonacci Number 10 is " + fib(arr, 10));
		System.out.println("Fibonacci Number 20 is " + fib(arr, 20));
		System.out.println("Fibonacci Number 15 is " + fib(arr, 15));
		System.out.println();
		

		System.out.println("Factorial of 5 is " + factorial(5));
		System.out.println("Factorial of 10 is " + factorial(10));
		System.out.println("Factorial of 20 is " + factorial(20));
		System.out.println("Factorial of 15 is " + factorial(15));
		System.out.println();

		init(arr);
		System.out.println("Factorial of 5 is " + factorial(arr, 5));
		System.out.println("Factorial of 10 is " + factorial(arr, 10));
		System.out.println("Factorial of 20 is " + factorial(arr, 20));
		System.out.println("Factorial of 15 is " + factorial(arr, 15));
		 
	}



	

}
