package logic;

public class Record {
	private String foodName;
	private int soldPrice;
	public Record(String foodName, int soldPrice) {
		super();
		this.foodName = foodName;
		this.soldPrice = soldPrice;
	}
	public String getFoodName() {
		return foodName;
	}
	public int getSoldPrice() {
		return soldPrice;
	}
	public String toString() {
		//System.out.println("Menu : "+foodName+" sold in "+soldPrice+" THB");
		return "Menu : "+foodName+" sold in "+soldPrice+" THB";
	}

}
