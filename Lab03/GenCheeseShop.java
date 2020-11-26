import java.util.Random;
import java.util.Scanner;

public class GenCheeseShop {

	public static void main(String[] args) {


		final int MAXCHEESE = 10;


		Scanner input = new Scanner(System.in);


		int sharpNum=0,swissNum = 0,brieNum=0;
		int[] charNum = new int[100000];
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];






		if(MAXCHEESE <=0) {
			System.out.println("We sell 0 kinds of Cheese ");
			System.out.println();
			System.out.println("Sub Total: $0.0");
			System.out.println("-Discount: $0.0");
			System.out.println("Total    : $0.0");
		}








		else {

			if(MAXCHEESE > 0) {
				names[0] = "Dalaran Sharp";
				prices[0] = 1.25;
			}
			if(MAXCHEESE > 1) {
				names[1] = "Stormwind Brie";
				prices[1] = 10.00;

			}
			if(MAXCHEESE >2) {
				names[2] = "Alterac Swiss";
				prices[2] = 40.00;
			}

			System.out.println("We sell " + MAXCHEESE+" kinds of Cheese");

			if(MAXCHEESE > 0) {
				System.out.println(names[0] + ": $" + prices[0] + " per pound");
			}

			if(MAXCHEESE > 1) {
				System.out.println(names[1] + ": $" + prices[1] + " per pound");
			}

			if(MAXCHEESE >2) {
				System.out.println(names[2] + ": $" + prices[2] + " per pound");
			}


			Random ranGen = new Random(100);
			for (int i = 3; i < MAXCHEESE; i++) {
				names[i] = "Cheese Type " + (char)('A'+i);
				prices[i] = ranGen.nextInt(1000)/100.0;
				amounts[i] = 0;
				System.out.println(names[i] + ": $" + prices[i] + " per pound");
			}

			if(MAXCHEESE >= 1) {
				System.out.print("Enter the amount of Dalaran Sharp : ");
				sharpNum = input.nextInt();
			}
			if(MAXCHEESE >= 2) {
				System.out.print("Enter the amount of Stormwind Brie :");
				brieNum = input.nextInt();
			}
			if(MAXCHEESE >=3) {
				System.out.print("Enter the amount of Alterac Swiss :");
				swissNum = input.nextInt();
			}


			for(int i=3; i<MAXCHEESE; i++) {
				System.out.print("Enter the amount of Cheese Type " + (char)('A'+i) + " : ");
				charNum[i] = input.nextInt();
			}

			System.out.print("Display the itemized list? (1 for yes) ");
			int displayItem = input.nextInt();

			if(displayItem == 1) {
				if(MAXCHEESE>=1) {
					if(sharpNum !=0) {
						System.out.println(sharpNum + " lbs of Dalaran Sharp @ 1.25 = $" + (sharpNum*1.25));
					}
				}
				if(MAXCHEESE >=2) {
					if(brieNum !=0) {
						System.out.println(brieNum + " lbs of Stormwind Brie @ 10.0 = $" + (brieNum*10.0));
					}
				}
				if(MAXCHEESE >=3) {
					if(swissNum !=0) {
						System.out.println(swissNum + " lbs of Alterac Swiss @ 40.0 = $" + (swissNum*40.0));
					}
				}

				for(int i =3; i<MAXCHEESE; i++) {
					if(charNum[i]!=0) {
						System.out.println(charNum[i] + " lbs of Cheese Type " +(char)('A'+i)+" @ " + prices[i] + " = "+ (charNum[i]*prices[i]));
					}
				}

			}

			double SubTotal =((sharpNum*1.25) + (brieNum*10.0) + (swissNum*40.0));
			for(int i=3; i<MAXCHEESE; i++) {
				SubTotal= SubTotal + (charNum[i]*prices[i]);
			}
			if(SubTotal <50) {
				System.out.println("Sub Total: $"+ SubTotal);
				System.out.println("-Discount: $0.0");
				System.out.println("Total    : $" + (SubTotal));
			}

			if(SubTotal >=50 && SubTotal <100) {
				System.out.println("Sub Total: $"+ SubTotal);
				System.out.println("-Discount: $10.0");
				System.out.println("Total    : $" + (SubTotal - 10.0));
			}
			if(SubTotal >= 100) {
				System.out.println("Sub Total: $"+ SubTotal);
				System.out.println("-Discount: $25.0");
				System.out.println("Total    : $" + (SubTotal - 25.0));
			}


		}
	}
}

