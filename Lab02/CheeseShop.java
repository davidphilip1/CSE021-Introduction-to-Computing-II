import java.util.Scanner;

public class cheeseshop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("We sell 3 kinds of Cheese");
		System.out.println("Dalaran Sharp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swiss: $40.00 per pound");
		
		System.out.print("Enter the amount of Sharp: ");
		int sharpNum=scan.nextInt();
		System.out.print("Enter the amount of Brie: ");
		int brieNum=scan.nextInt();
		System.out.print("Enter the amount of Swiss: ");
		int swissNum=scan.nextInt();
		
		System.out.print("Display the itemized list? (1 for yes) ");
		int displayNum=scan.nextInt();
		
		if(displayNum == 1) {
			System.out.println(sharpNum + " lbs of Sharp @ $1.25 = $" + (sharpNum*1.25));
			System.out.println(brieNum + " lbs of Brie @ $10.00 = $" + (brieNum*10.00));
			System.out.println(swissNum + " lbs of Swiss @ $40.00 = $" + (swissNum*40.00));
		}
		
		
		
		double subTotal = ((sharpNum*1.25)+(brieNum*10.00)+(swissNum*40.00));
		System.out.println("Sub Total: $" + subTotal);
		if(subTotal < 50) {
			System.out.println("-Discount: $0.0");
			System.out.println("Total    : $" + subTotal);
		}
		
		else if(subTotal >=50 && subTotal < 100) {
			System.out.println("-Discount: $10.0");
			System.out.println("Total    : $" + (subTotal-10.0));
			
		}
		
		else if(subTotal >=100){
			System.out.println("-Discount: $25.0");
			System.out.println("Total    : $" + (subTotal-25.0));
			
		}
		
		
		
		
		
	}
}
