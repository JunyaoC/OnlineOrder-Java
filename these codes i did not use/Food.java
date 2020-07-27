//package onlineShop;

import java.util.Scanner;

public class Food {

	public double totalAmount;
	public static double runningTotal;
	private static double itemPrice;
	static boolean ordering = true;
	static Scanner input = new Scanner(System.in);
	public static void menu(){
	    System.out.println("Welcome, please select the food number to place order. \n1. Spagetti (Rm18.00) \n2. Baked Rice (Rm26.00)\n3. Cupcake (Rm6.00)");
	    System.out.println("Press number 4 if you have done complete your order.");
	}
	public static double itemPrice(int foodItem) {
	    if (foodItem == 1) {
	        //spagetti= Rm18.00
	        System.out.println("You've selected a spagetti");
	        itemPrice = 18.00;
	    }
	    if (foodItem == 2) {
	        //baked rice= Rm26.00
	        System.out.println("You've selected a baked rice");
	        itemPrice = 26.00;
	    }
	    if (foodItem == 3) {
	        //cupcake= Rm6.00
	        System.out.println("You've selected a cupcake");
	        itemPrice = 6.00;
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
	    System.out.println("Total Amount: " + runningTotal);
	    System.out.println("You have completed your order.Enjoy your meal and have a nice day.");
	}
	public static void main(String[] args) {
	    int menuOption;
	    int foodItem = 0;
	    input = new Scanner(System.in); 
	        runningTotal =0;
		    do{
	        menu();
	        menuOption = input.nextInt();    
	        switch(menuOption){
	            case 1:
	                foodItem = 1;
	                itemPrice(foodItem);
	                break;
	            case 2:
	                foodItem = 2;
	                itemPrice(foodItem);
	                break;
	            case 3:
	                foodItem = 3;
	                itemPrice(foodItem);
	                break;
	            case 4:
	                completed();
	                break;      
	            default:
	                System.out.println("Invalid option.");
	        }

	    } while(ordering); {
	}
	}

}