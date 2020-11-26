import java.util.Scanner;

public class remainderFunc {

	
	void main() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter the max number: ");
		 int maxNum = scan.nextInt();
		 System.out.println("Please enter the divisor: ");
		 int divisor = scan.nextInt();
		
		 for(int i=1; i<=maxNum; i++) {
			 int result = i % divisor;
			 System.out.println("Num: " + i  + " % " + divisor + " = " + result);
			 
		 }
	 }
}
