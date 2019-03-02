package logic;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Store {
	private String name;
	private int totalSales;
	private List <Record> records= new ArrayList<Record>();
	private List <Menu>menus = new  ArrayList<Menu> ();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = Math.min(0,totalSales);
	}
	public List<Record> getRecords() {
		return records;
	}
	public void setRecords(List<Record> records) {
		this.records = records;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	public Store(String name) {
		super();
		this.name = name;
	}
	public void showAllMenu() {
		for (int i=0;i< menus.size();i++)
		{
			System.out.println("["+(i+1)+"]"+menus.get(i).toString());
		}
	}
	public void showRecord()
	{
		for(Record r:records)
		{
			System.out.println(r.toString());
		}
	}



	public void sell(Menu menu, boolean isSpecial) {
		int price;
		System.out.println("Please select valid menu.");
		if(isSpecial) {
			Record r = new Record(menu.getName(),menu.getSpecialPrice());
			records.add(r);
			totalSales+=menu.getSpecialPrice();
			price=menu.getSpecialPrice();
			
		}
		else
		{
			Record r = new Record(menu.getName(),menu.getPrice());
			records.add(r);		
			totalSales+=menu.getPrice();
			price=menu.getPrice();
		}
		
		System.out.println("Thank you for buying " + menu.getName() + " " + price + " Bath");
	}
	public boolean addMenu(Menu menu)
	{
		if(menus.contains(menu)) {
		return false;			
		}
		menus.add(menu);
		return true;

	}
	public void addRecord(Record record)
	{
		records.add(record);
	}


	public void sellProcessHandle() {
		//FILL CODE
		System.out.println("---------------------------");
		System.out.println("Welcome to "+this.name);
		System.out.println("---------------------------");

		if(menus.size()==0)System.out.println("Please add menu first");
		else
		{
			showAllMenu();
			System.out.print("Please select menu : ");
			Scanner command = new Scanner(System.in);
			int ch = command.nextInt();
			ch =ch-1;

		System.out.print("Upgrade to special ? (Y/N) :");
		    String d =command.next();
		    if(d.equals("Y"))sell(menus.get(ch),true);
		    else if (d.equals("N"))sell(menus.get(ch),false);
		}

		
	}

	public void manageProcessHandle() {
		System.out.println("---------------------------");
		System.out.println("Welcome to "+this.name);
		System.out.println("---------------------------");
		System.out.println("1. Add menu");
		System.out.println("2. Show summary");
		System.out.println("Select a program to do : ");
		Scanner command = new Scanner(System.in);
		int choice = command.nextInt();
			if(choice==1)addMenuHandle();
			else if (choice==2)showSummary();
		
	}
	
	private void addMenuHandle() {
		Scanner command = new Scanner(System.in);
		int price;
		String menuName;
		System.out.println("Please enter menu name :");
			menuName=command.nextLine();
		System.out.println("Please enter price :");
				price=command.nextInt();
		System.out.println("New menu " + name + " added!");
		Menu m =new Menu(menuName,price);
		if(!menus.contains(m))menus.add(m);
	}

	private void showSummary() {
		
		System.out.println("Total Sales : " + this.totalSales);
		showRecord();
	
	}

	
}
