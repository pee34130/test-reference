package logic;

public class Tank extends Hero{
    private int armor;
	public Tank(String name, int power, int hp,int armor) {
		super(name, power, hp);
		this.armor =armor<1? 1:armor;
		
	}
	public int takeDamage(int damage) {
		damage-=armor;
		damage = damage <0? 0:damage;
		int ans = this.getHp() < damage ? this.getHp():damage ;
		this.hp -=damage;
		this.hp =this.getHp()<0? 0:this.getHp();
		return ans;
			
	}
	public int takePiercingDamage(int damage) {
		/*damage = damage <0? 0:damage;
		hp -=damage;
		hp =hp<0? 0:hp;
		return damage;*/
		return super.takeDamage(damage);
		
	}
	public String printStat() {
		return "[atk:"+this.getPower()+" hp:"+this.getHp()+" armor:"+armor+"]";
		
	}
	public int getArmor() {
		return armor;
	}
	


	

}
