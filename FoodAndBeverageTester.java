// package onlineShop;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class FoodAndBeverageTester {

	private static ArrayList<Item> foodDB;
	private static ArrayList<Item> bevDB;
	private static ArrayList<Item> order;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		///you can try to initialize the system by reading items from a file eg: .csv
		foodDB = new ArrayList<Item>();	//// but in this particular case we're no going to that extend so we'll just always initialize an empty itemDB
		bevDB = new ArrayList<Item>();

		System.out.println("Online Shop v1.0\nThe system is not ready for sale since it's not initialized.\nNo save files found, so please enter details of each item.\n\n[Press ENTER to initialize system]");



		try {	/// just a simple try block to detect input
			System.in.read();
			in.nextLine();
			clrscr();		/// clears the screen

			boolean exitInit = false;



			while(!exitInit){

				addItemToDB();
				clrscr();		
				System.out.println("\nItem(s) recorded: \n" + foodDB.size() + " Food\n" + bevDB.size() + " Beverage\nTotal: " + (foodDB.size() + bevDB.size()));
				System.out.println("Add more items? [Y/N]");
				String choice = in.nextLine();

				if(choice.equals("Y") || choice.equals("y")){
					exitInit = true;
				}else{
					exitInit = false;
				}

			}

			//// now we have items in our database, cont

			System.out.println("Select an operation: \n[1] Add more items\n[2] Enter sale mode");
			String operation = in.nextLine();

			switch(operation){

				case "1":{

					exitInit = false;

					while(!exitInit){

						addItemToDB();
						clrscr();		
						System.out.println("\nItem(s) recorded: \n" + foodDB.size() + " Food\n" + bevDB.size() + " Beverage\nTotal: " + (foodDB.size() + bevDB.size()));
						System.out.println("Add more items? [Y/N]");
						String choice = in.nextLine();

						if(choice.equals("Y") || choice.equals("y")){
							exitInit = true;
						}else{
					exitInit = false;
				}

					}


					break;
				}

				case "2":{

					System.out.println("Entering sale mode will not allow you to edit items anymore. Proceed? [Y/N]");
					String choice = in.nextLine();

					if(choice.equals("Y") || choice.equals("y")){
						startSale();
					}else{
					exitInit = false;
				}

					break;
				}


			}





		} catch(Exception e){

		}

	}


	public static void clrscr(){

    //Clears Screen in java

		try {

			if (System.getProperty("os.name").contains("Windows"))

				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			else

				Runtime.getRuntime().exec("clear");

		} catch (IOException | InterruptedException ex) {}

	}

	public static void addItemToDB(){

		Scanner in = new Scanner(System.in);	/// declare a new scanner obj to get input

		System.out.print("\n[Init] Please choose the item type: \n[1] Food\n[2] Beverage\n\nEnter the number of your choice: ");
		String itemType = in.nextLine();

		System.out.print("[Init] Name of item: ");
		String itemName = in.nextLine();

		System.out.print("[Init] Price of item: ");
		String itemPrice = in.nextLine();

		System.out.print("[Init] Stock level (count of item in inventory): ");
		String itemStock = in.nextLine();

		//// here we take in all the values and cast/parse them into respective correct data type
		//// the motive of using a string input type is to prevent error handing.

		Item newItem = new Item(Double.parseDouble(itemPrice),itemName,itemType,Integer.valueOf(itemStock));
		
		switch(itemType){

			case "1":{
				foodDB.add(newItem);
				break;
			}

			case "2":{
				bevDB.add(newItem);
				break;
			}

		}


	}

	public static void startSale(){

		clrscr();

		System.out.println("\nOnline Shop V1.0 [SALE MODE]\nWelcome to the online store! Pick a menu:");

		System.out.println("[1] Food Menu\n[2] Beverage Menu");
		Scanner in = new Scanner(System.in);
		String menuChoice = in.nextLine();

		printMenu(menuChoice);
		
	}

	public static void printMenu(String menuChoice){

		switch(menuChoice){

			case "1":{


				for(int i=0;i<foodDB.size();i++){

					if(foodDB.get(i).getStock() >= 1){
						System.out.println("[" + (i+1) + "] " + foodDB.get(i).getName() + " RM:" + foodDB.get(i).getPrice());
					}else{
						System.out.println("[" + (i+1) + "] " + foodDB.get(i).getName() + " RM:" + foodDB.get(i).getPrice() + "[Out of Stock]");
					}


				}

				break;
			}

			case "2":{

				for(int i=0;i<bevDB.size();i++){

					if(bevDB.get(i).getStock() >= 1){
						System.out.println("[" + (i+1) + "] " + bevDB.get(i).getName() + " RM:" + bevDB.get(i).getPrice());
					}else{
						System.out.println("[" + (i+1) + "] " + bevDB.get(i).getName() + " RM:" + bevDB.get(i).getPrice() + "[Out of Stock]");
					}


				}
			}


		}

	}

	
}
