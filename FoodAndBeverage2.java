//package onlineShop;

public class FoodAndBeverage2 {

	private int beverageNumber;
    private String beverage;
    private int amountOfStockAvailable;
    private double price;
    
    //Default constructor
    public FoodAndBeverage2(){
        beverageNumber = 0;
        beverage = null;
        amountOfStockAvailable = 0;
        price = 0;
    }
    
    public FoodAndBeverage2(int beverageNumber, String beverage, int amountOfStockAvailable, int price){
        this.beverageNumber = beverageNumber;
        this.beverage = beverage;
        this.amountOfStockAvailable = amountOfStockAvailable;
        this.price = price;
    }
    
    //Get beverage's number
    public int getBeverageNumber(){
        return beverageNumber;
    }
    
    //Set beverage's number
    public void setBeverageNumber(int x){
    	beverageNumber = x;
    }
    
    //Get beverage's name
    public String getBeverage(){
        return beverage;
    }
    
    //Set beverage's name
    public void setBeverage(String x){
    	beverage = x;
    }
    
    //Get amount of stock available
    public int getAmountOfStockAvailable(){
        return amountOfStockAvailable;
    }
    
    //Set amount of stock available
    public void setAmountOfStockAvailable(int x){
    	amountOfStockAvailable = x;
    }
    
    //Get beverage's price
    public double getPrice(){
        return price;
    }
    
    //Set beverage's price
    public void setPrice(int x){
        price = x;
    }
}