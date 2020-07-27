public class Item {
	
	private double itemPrice;
	private String itemName;
	private String itemType;
	private int itemStock;

	public Item(double _ip, String _in, String _it, int _is){
		this.itemPrice = _ip;
		this.itemName = _in;
		this.itemType = _it;
		this.itemStock = _is;
	}

	public double getPrice(){		
		return this.itemPrice;
	}

	public String getName(){		
		return this.itemName;
	}

	public int getStock(){		
		return this.itemStock;
	}

	public String getType(){
		return this.itemType;
	}

}