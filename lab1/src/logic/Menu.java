package logic;

public class Menu {
	private String name;
	private int price;
	private int specialPrice;
	public Menu(String name, int price) {
		this.name = name;
		this.price = Math.min(Math.max(price,0),200);
		if(price>100)specialPrice=price+20;
		else if(price>50)specialPrice=price+10;
		else specialPrice=price+5;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = Math.min(Math.max(price,0),200);
		
	}
	public int getSpecialPrice() {
		return specialPrice;
	}
	public void setSpecialPrice(int specialPrice) {
		this.specialPrice = Math.max(0,Math.min(specialPrice,200));
	}
	public String toString() {
		//System.out.println( name +" price : "+price+" (special"+specialPrice+")");
		return name +" Price : "+price+" (special "+specialPrice+")";
		//"testName Price : 100 (special 110)"
	}
	public static void main(String[] arg)
	{
		Menu a =new Menu ("Menu",100);
		a.toString();
	}



}
