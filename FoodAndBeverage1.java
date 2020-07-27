//package onlineShop;

public class FoodAndBeverage1 {

	private int foodNumber;
    private String food;
    private int amountOfStockAvailable;
    private double price;
    
    //Default constructor
    public FoodAndBeverage1(){
        foodNumber = 0;
        food = null;
        amountOfStockAvailable = 0;
        price = 0;
    }
    
    public FoodAndBeverage1(int foodNumber, String food, int amountOfStockAvailable, int price){
        this.foodNumber = foodNumber;
        this.food = food;
        this.amountOfStockAvailable = amountOfStockAvailable;
        this.price = price;
    }
    
    //Get food's number
    public int getFoodNumber(){
        return foodNumber;
    }
    
    //Set food's number
    public void setFoodNumber(int x){
        foodNumber = x;
    }
    
    //Get food's name
    public String getFood(){
        return food;
    }
    
    //Set food's name
    public void setFood(String x){
        food = x;
    }
    
    //Get amount of stock available
    public int getAmountOfStockAvailable(){
        return amountOfStockAvailable;
    }
    
    //Set amount of stock available
    public void setAmountOfStockAvailable(int x){
    	amountOfStockAvailable = x;
    }
    
    //Get food's price
    public double getPrice(){
        return price;
    }
    
    //Set food's price
    public void setPrice(int x){
        price = x;
    }
}