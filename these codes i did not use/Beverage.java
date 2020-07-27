//package onlineShop;

import java.util.Scanner;

public class Beverage {

	public double totalAmount;
	public static double runningTotal;
	private static double itemPrice;
	static boolean ordering = true;
	static Scanner input = new Scanner(System.in);
	public static void menu(){
	    System.out.println("Welcome, please select the beverage number to place order. \n1. Coffee (Rm8.00) \n2. Hot Chocolate (Rm9.00)\n3. Orange Juice (Rm9.00)\n4. Milkshake (Rm13.00)");
	    System.out.println("Press number 5 if you have done complete your order.");
	}
	public static double itemPrice(int beverageItem) {
	    if (beverageItem == 1) {
	        //coffee= Rm8.00
	        System.out.println("You've selected a cup of coffee");
	        itemPrice = 8.00;
	    }
	    if (beverageItem == 2) {
	        //hot chocolate= Rm9.00
	        System.out.println("You've selected a cup of hot chocolate");
	        itemPrice = 9.00;
	    }
	    if (beverageItem == 3) {
	        //orange juice= Rm9.00
	        System.out.println("You've selected a bottle of orange juice");
	        itemPrice = 9.00;
	    }
	    if (beverageItem == 4) {
	        //milkshake= Rm13.00
	        System.out.println("You've selected a milkshake");
	        itemPrice = 13.00;
	    }
	    quantity();
	    return itemPrice;
	}
	public static double quantity() {
	    System.out.println("Enter quantity");       
	    double quantity = input.nextDouble();
	    totalAmount(quantity, itemPrice);
	    return quantity;
	 }
	public static double totalAmount(double quantity, double itemPrice) {
	    double totalAmount = quantity*itemPrice;
	    System.out.println("Total Amount: "+ totalAmount);
	    runningTotal += totalAmount;
	    return totalAmount;
	}
	public static void completed(){
	    ordering = false;
	    System.out.println("Total Amount:" + runningTotal);
	    System.out.println("You have completed your order. Enjoy your meal and have a nice day.");
	}
	public static void main(String[] args) {
	    int menuOption;
	    int beverageItem = 0;
	    input = new Scanner(System.in); 
	    runningTotal =0;
		    do{
	        menu();
	        menuOption = input.nextInt();    
	        switch(menuOption){
	            case 1:
	                beverageItem = 1;
	                itemPrice(beverageItem);
	                break;
	            case 2:
	                beverageItem = 2;
	                itemPrice(beverageItem);
	                break;
	            case 3:
	                beverageItem = 3;
	                itemPrice(beverageItem);
	                break;
	            case 4:
	                beverageItem = 4;
	                itemPrice(beverageItem);
	                break;
	            case 5:
	                completed();
	                break;      
	            default:
	                System.out.println("Invalid option.");
	        }

	    } while(ordering); {
	}
	}

}