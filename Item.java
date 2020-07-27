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

	public void setPrice(int _price){		
		this.itemPrice = _price;
	}

	public void setName(String _name){		
		this.itemName = _name;
	}

	public void setStock(int _stock){		
		this.itemStock = _stock;
	}

	public void setType(String _type){
		this.itemType = _type;
	}

}