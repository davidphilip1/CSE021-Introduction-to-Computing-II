

import java.util.*;
public class Shop {

	public static Scanner input = new Scanner(System.in);
	public static String[] product = new String[100000];
	public static int[] price = new int[1000000];
	public static int[] amount = new int[1000000];
	static double discountPercentage;
	static int discountAmount;




	//////////////////////////// 1 /////////////////////////////////////////////////////////////////
	public static void initShop() {
		System.out.print("Please enter the number of items: ");
		int setupShop = input.nextInt();


		for(int i = 0; i<setupShop; i++) {
			System.out.print("Enter name of product " + i +" :");
			product[i]=input.next();
			System.out.print("Enter price of product " + i +" :");
			price[i]=input.nextInt();
		}

		System.out.print("Please enter the amount to qualify for discount: ");
		discountAmount = input.nextInt();
		System.out.print("Please enter the discount rate(0.1 for 10%): ");
		discountPercentage = input.nextDouble();
	}



	//////////////////////// 2 //////////////////////////////////////////////////////
	public static void buyShop() {
		System.out.println();
		for(int i=0; i<product.length; i++) {
			if(product[i] != null) {
				System.out.print("Enter the amount of " + product[i] + " : ");
				amount[i] = input.nextInt();
			}
		}
	}
	////////////////////////// 3 //////////////////////////////////////////////////////////////////
	public static void listShop() {
		for(int i =0; i<product.length; i++) {
			if(product[i] != null) {
				System.out.println(amount[i] + " count of " + product[i] + " @ " + price[i] + " = " + (amount[i]*price[i]));
			}

		}
	}

	////////////////////////////// 4 ///////////////////////////////////////////////////////////////
	public static void checkout() {
		System.out.println();
		System.out.println("Thanks for coming!");

		double subtotal = 0;
		double discountRate = 0;
		for(int i = 0; i<product.length; i++) {
			if(product[i] != null)
				subtotal += amount[i]*price[i]; 
			discountRate = subtotal*discountPercentage;
		}

		System.out.println("Sub Total: $" + subtotal);
		if(subtotal >= discountAmount) {
			System.out.println("-Discount: $" + discountRate);
		}
		else {
			System.out.println("-Discount: $0.0");
			discountRate =0;

		}
		System.out.println("Total    : $" + (subtotal-discountRate));

	}




	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		boolean count = true;

		int stepCounter =0;



		while(count == true) {
			System.out.println("This program supports 4 functions:");
			System.out.println("1. Setup Shop");
			System.out.println("2. Buy");
			System.out.println("3. List Items");
			System.out.println("4. Checkout");
			System.out.print("Please choose the function you want: ");

			int listItem = input.nextInt();

			if(listItem != 1 && listItem != 2 && listItem != 3 && listItem != 4) {
				System.out.println();
				System.out.println("Error: Do not know " + listItem);
				System.out.println();
			}

			else if(listItem == 1) {
				initShop();
				stepCounter = 1;
			}
			else if(listItem == 2) {
				if(stepCounter == 1) {

					buyShop();
					stepCounter = 2;
				}


			}

			else if(listItem == 3) {
				if(stepCounter == 2) {

					listShop();
					stepCounter=2;
				}
				else {
					System.out.println();
					System.out.println("Try again: You have not bought anything");
					System.out.println();
					stepCounter = 1;
				}
			}

			else if(listItem == 4) {
				if(stepCounter == 2) {

					checkout();
					return;
				}
				else {
					System.out.println();
					System.out.println("Try again: You have not bought anything");
					System.out.println();
				}
			}





			if(stepCounter == 0 && (0<= listItem) && (listItem >= 0)) {
				System.out.println();
				System.out.println("Shop is not setup yet!");
				System.out.println();
			}





		}
	}
}

