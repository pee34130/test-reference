package blacksmith;

public class Sword {

	private int attack;
	private int durability;
	
	public Sword(int attack, int durability) {
		this.attack = attack < 1 ? 1 : attack;
		this.durability = durability < 1 ? 1 : durability;
	}
	
	public void upgrade(int val) {
		if(val>=0)
		{
		this.attack += val;
		this.durability++;
		}
		else this.durability++;
		
	}
	
	public int doParry(int attack) {
		attack = attack < 1 ? 1 : attack;
		this.durability--;
		int damage = attack -= this.attack;
		return damage< 0?0:damage;
	}
	
	public boolean isBroken() {
		return this.durability <= 0;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getDurability() {
		return durability;
	}
}
