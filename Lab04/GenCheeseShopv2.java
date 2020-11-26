import java.util.Random;
import java.util.Scanner;

public class GenCheeseShopv2 {

	public static void intro(String[] names, double[]prices, int[] amounts) {
		// Fill-in
		if(amounts.length == 0) {
			System.out.println("We sell 0 kinds of Cheese");
		}
		else {
			System.out.println("We sell " + amounts.length + " kinds of Cheese");
		}
		if(amounts.length > 0 ) {
			System.out.println("Dalaran Sharp: $1.25 per pound");
			names[0] = "Dalaran Sharp";
			prices[0] = 1.25;
		}
		if(amounts.length >1 ) {
			System.out.println("Stormwind Brie: $10.0 per pound");
			names[1] = "Stromwind Brie";
			prices[1] = 10.0;
		}
		if(amounts.length >2) {
			System.out.println("Alterac Swiss: $40.0 per pound");
			names[2] = "Alterac Swiss";
			prices[2] = 40.0;
		}
		Random ranGen = new Random(100);
		for (int i = 3; i < amounts.length; i++) {
			names[i] = "Cheese Type " + (char)('A'+i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
			
		
	}

	public static void getAmount(Scanner input, String[] names, int[] amounts) {
		// Fill-in
		if(amounts.length >0) {
			System.out.print("Enter the amount of Dalaran Sharp :");
			names[0] = "Dalaran Sharp";
			amounts[0]=input.nextInt();
		}
		if(amounts.length>1) {
			System.out.print("Enter the amount of Stromwind Brie :");
			names[1] = "Stromwind Brie";
			amounts[1]=input.nextInt();
		}
		if(amounts.length>2) {
			System.out.print("Enter the amount of Alterac Swiss :");
			names[2] = "Alterac Swiss";
			amounts[2]=input.nextInt();
		}
		for(int i=3; i<amounts.length;i++) {
			System.out.print("Enter the amount of Cheese Type " + (char)('A'+i) + " : " );
			char temp = (char)('A' + i);
			names[i] = String.valueOf(temp);
			amounts[1]=input.nextInt();
			
		}
		
	}

	public static void itemizedList(String[] names, double[]prices, int[] amounts) {
		// Fill-in
		if(amounts.length>0) {
			System.out.println(amounts[0] + " lbs of Dalaran Sharp @ 1.25 = "+ (amounts[0]*prices[0]));
		}
		if(amounts.length>1) {
			System.out.println(amounts[1] +" lbs of Stormwind Brie @ 10.0 = " + (amounts[1]*prices[1]));
			
		}
		if(amounts.length>2) {
			System.out.println(amounts[2]+ " lbs of Alterac Swiss @ 40.0 = " + (amounts[2]*prices[2]));
		}
		
		for(int i=3; i<amounts.length; i++) {
			if(!(amounts[i] == 0 || names == null)) {
			System.out.println(amounts[i] + " lbs of Cheese Type " + names[i] + " @ " + prices[i] + " = " + (amounts[i]*prices[i]));
		}
		}
	}

	public static double calcSubTotal(double[] prices, int[] amounts) {
		double total=0;
		if(amounts.length>0) {
			total += (amounts[0]*prices[0]);
		}
		if(amounts.length>1) {
			total += (amounts[1]*prices[1]);
		}
		if(amounts.length>2) {
			total += (amounts[2]*prices[2]);
		}
		
		for(int i=3; i<amounts.length; i++) {
			
		total += amounts[i]*prices[i];
		}
		return total;
		
	}

	public static int discount(double subTotal){
		if(subTotal < 50) {
			return 0;
		}
		else if(subTotal >= 50 && subTotal <100 ) {
			return 10;
		}
		else if(subTotal >= 100 ) {
			return 10;
		}
		
		return 0;
	}

	public static void printTotal(double subTotal, int discount) {
		// Fill-in
		
		System.out.println("Sub Total: " + subTotal);
		System.out.println("-Discount: " + discount);
		System.out.println("Total: " + (subTotal-discount));

	}

	public static void main(String[] args) {

		final int MAXCHEESE = 2;

		// DO NOT CHANGE ANYTHING BELOW
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		Scanner input = new Scanner(System.in);

		intro(names, prices, amounts);

		getAmount(input, names, amounts);

		double total = calcSubTotal(prices, amounts);
		
		if (MAXCHEESE > 0) {
			System.out.print("Display the itemized list? (1 for yes) ");
			int itemized = input.nextInt();

			if (itemized == 1) {
				itemizedList(names, prices, amounts);
			}
		}

		System.out.println();

		printTotal(total,discount(total));
	}
}
