import java.util.*;

public class ShopArr {

	// Instance Variables
	private Cheese[] cheese;
	
	// Initialize method
	private void init(int max) {
		
		// Create max number of Cheese pointers
		cheese = new Cheese[max]; 
		
		if (max > 0) {
			cheese[0] = new Cheese();
			cheese[0].setName("Dalaran Sharp");
			cheese[0].setPrice(1.25);
		}
		
		if (max > 1) {
			cheese[1] = new Cheese("Stormwind Brie");
			cheese[1].setPrice(10.00);
		}
		
		if (max > 2) {
			cheese[2] = new Cheese("Alterac Swiss", 40.00);
			//cheese[2].setName("Wrong Name");
		}
		
		Random ranGen = new Random(100);
		
		for (int i = 3; i < max; i++) {
			// Fill-in Code
			char B = (char) ('A'+i);
			String C = String.valueOf(B);
			cheese[i] = new Cheese(C);
			cheese[i].setPrice(ranGen.nextInt(1000)/100.0);
		}
		
	}
	public ShopArr() {
		init(10);
	}
	
	public ShopArr(int max) {
		// Fill-in Code
	}

	private void intro(Scanner input) {
		System.out.println("We sell " + cheese.length + " types of Cheese");

		// Fill-in Code
		if(cheese.length>0) {
			System.out.println(cheese[0].getName() + ": $" + cheese[0].price + " per pound");
		}
		if(cheese.length>1) {
			System.out.println(cheese[1].name + ": $" + cheese[1].price + " per pound");
		}
		if(cheese.length>2) {
			System.out.println(cheese[2].name + ": $" + cheese[2].price + " per pound");
		}
		
		for(int i=3; i<cheese.length; i++) {
			System.out.println("Cheese Type " +cheese[i].name+ ": $" + cheese[i].price + " per pound");
		}
		if(cheese.length>0) {
			System.out.print("Enter the amount of " + cheese[0].name + " : ");
			cheese[0].amount=input.nextInt();
		}
		if(cheese.length>1) {
			System.out.print("Enter the amount of " + cheese[1].name + " : ");
			cheese[1].amount=input.nextInt();
		}
		if(cheese.length>2) {
			System.out.print("Enter the amount of " + cheese[2].name + " : ");
			cheese[2].amount=input.nextInt();
		}
		for(int i=3; i<cheese.length; i++) {
			System.out.print("Enter the amount of Cheese Type " + cheese[i].name + " : ");
			cheese[i].amount=input.nextInt();
		}
		
		
//		init(cheese.length);
	}

	private double calcSubTotal() {
		double amount = 0;
		// Fill-in Code
	
		for(int i=0; i < cheese.length; i++ ) {
		amount += cheese[i].amount*cheese[i].price;
		}
		return amount;
	}

	private double discount(double sub) {
		return ((sub > 100)? 25 : (sub > 50)? 10: 0);
	}

	private void itemizedList(){
		int amt;
		System.out.println();
		
		// Fill-in Code
		for(int i =0 ; i<3; i++) {
			System.out.println(cheese[i].amount + " lbs of " + cheese[i].name + " @ " + cheese[i].price + " = $" + (cheese[i].amount*cheese[i].price));
		}
		for(int i=3; i <cheese.length; i++) {
			System.out.println(cheese[i].amount + " lbs of Cheese Type " + cheese[i].name + " @ " + cheese[i].price + " = $" + (cheese[i].amount*cheese[i].price));
		}
	}

	private void printTotal(double sub, double disc) {
		System.out.println();
		System.out.println("Sub Total  : $" + sub);
		System.out.println("- Discount : $"+ disc);
		System.out.println("Total Price: $" + (sub - disc));
	}

	private void printFree(){
		int amt;
		System.out.println();
		System.out.println("Today is your lucky day!");
		for (int i = 0; i < cheese.length; i++) 		
			if ((amt = cheese[i].getAmount()) > 0)
				System.out.println(amt + " lbs of " + cheese[i].getName() + " @ $0 = " + 0);
		System.out.println("Total Price: FREE");
	}

	public void run() {

		Scanner input = new Scanner(System.in);
		intro(input);
		double sub = calcSubTotal();
		double disAmt = discount(sub);

		System.out.println();
		System.out.print("Do you want to see the itemized list? (1 for yes): ");
		int list = input.nextInt();
		if (list == 1)
			itemizedList();	

		int free = (new Random()).nextInt(100);
		//System.out.println("Random num is "+ free);
		if (free != 0)
			printTotal(sub, disAmt);
		else {
			printFree();
			return ;
		}

		System.out.println();
		System.out.print("Do you wish to redo your whole order? (1 for yes): ");
		int redo = input.nextInt();

		System.out.println();

		if (redo == 1)
			run();
		else
			System.out.println("Thanks for coming!");
	}
}
