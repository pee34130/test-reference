package hero;

import item.base.Item;

public class Hero {
	private String name ;
	private int hp, attack, defense ,inventorySize;
	private Item[] inventory ;
	public Hero(String name, int hp, int attack, int defense, int inventorySize) {
	    this.hp =  hp<1?1:hp;
		this.name=name;
		this.attack=attack;
		this.defense=defense;
		inventorySize = inventorySize<1?1:inventorySize;
		this.inventorySize=inventorySize>6?6:inventorySize;
		inventory = new Item[inventorySize];
		
	}

	public Item[] getInventory() {
		return  inventory.clone();

	}

	public int equipItem(Item item)throws EquipItemFailedException{
		int count=0;
		for(Item i:inventory) {
			if(i==null) {
				inventory[count]=item;
				item.applyBonuses(this);
				return count;
			}
			count++;
		}
		throw new EquipItemFailedException("Hero inventory is full");
	}

	public Item unequipItem(int slotNumber) throws UnequipItemFailedException{
		if(slotNumber<0 || slotNumber>=inventorySize)throw new UnequipItemFailedException("Hero does not have that many slots");
		if(inventory[slotNumber]==null)throw new UnequipItemFailedException("No item in that slot");
		Item presentItem =inventory[slotNumber];
		inventory[slotNumber].unapplyBonuses(this);
		inventory[slotNumber] =null;
		return presentItem;
		
	}

	@Override
	public String toString() {
		// you do NOT need to modify this method
		return new StringBuilder()
				.append("{").append(this.getName()).append("}")
				.append(":[")
				.append("hp:").append(this.getHp())
				.append(" atk:").append(this.getAttack())
				.append(" def:").append(this.getDefense())
				.append("] ")
				.append("(").append(this.getInventorySize()).append(" item slots)")
				.toString();
	}

	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp =  hp<1?1:hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getInventorySize() {
		return inventorySize;
	}

	
}
