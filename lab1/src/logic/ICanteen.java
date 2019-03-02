package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ICanteen {
    static List<Store> stores=new ArrayList<Store>();

	public static void main(String[] args) {
		while (true) {
			//FILL CODE
			printMain();
			System.out.print("Select a program to do : ");
			Scanner command = new Scanner(System.in);
			int ch = command.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("---------------------------");
				addStoreHandle();
				System.out.println("---------------------------");
				break;
			case 2:
				System.out.println("---------------------------");
				manageStoreHandle();
				System.out.println("---------------------------");
				break;
			case 3:
				System.out.println("---------------------------");
				buyFoodHandle();
				System.out.println("---------------------------");
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid input!!");
			}

		}

	}

	private static void addStoreHandle() {		
		System.out.print("Store Name : ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		Store mystore = new Store(name);
		stores.add(mystore);
	
		System.out.println("The store named " + name + " was added!");
	}

	private static boolean manageStoreHandle() {
		//FILL CODE
		if(!showStores())return false;
	
		Scanner command = new Scanner(System.in);
		int ch = command.nextInt();
		stores.get(ch-1).manageProcessHandle();
		return true;
	}

	private static boolean buyFoodHandle() {
		//FILL CODE
		if(!showStores())return false;
		Scanner command = new Scanner(System.in);
		int ch = command.nextInt();
		stores.get(ch-1).sellProcessHandle();
		return true;
	}

	public static void printMain() {
		System.out.println("=========== Main Menu ==========");
		System.out.println("What to do?");
		System.out.println("1. Add Store");
		System.out.println("2. Manage Store");
		System.out.println("3. Buy food");
		System.out.println("4. Exit program");
	}

	public static boolean showStores() {
		//FILL CODE
		if(stores.size()==0) {
			System.out.println("Please add store first!!");
			 return false;
			}
		System.out.println("Here are all stores");
		for(int i=0;i<stores.size();i++)
		{
			System.out.println("["+(i+1)+"] "+stores.get(i).getName());
		}
		System.out.print("Please select store :");
		return true;
	}
}
