//package onlineShop;

import java.util.Scanner;

public class calculator{

	public static void main(String[] args) {
		
				System.out.print("Calculator to calculate the amount of stock available");
		        Scanner in = new Scanner(System.in);
		        System.out.print("\n1. Number of spagetti: ");
		        int firstInt = in.nextInt();
		        System.out.print("\n2. Number of baked rice: ");
		        int secondInt = in.nextInt();
		        System.out.print("\n3. Number of cupcake: ");
				int thirdInt = in.nextInt();
		        System.out.print("\n4. Number of coffee: ");
				in.nextInt();
		        System.out.print("\n5. Number of hot chocolate: ");
				in.nextInt();
		        System.out.print("\n6. Number of orange juice: ");
				in.nextInt();
		        System.out.print("\n7. Number of milkshake: ");
				in.nextInt();
				
		        System.out.printf("Total number: %d%n", firstInt + secondInt + thirdInt);
		
		         {
					in.close();
				}
	}

}

	