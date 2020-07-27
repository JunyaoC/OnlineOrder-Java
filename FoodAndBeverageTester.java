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

				System.out.println("Item(s) recorded: \n" + foodDB.size() + "Food\n" + bevDB.size() + "Beverage");
				


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

	
}
