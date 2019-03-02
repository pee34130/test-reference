package logic;

public class Hero {
	protected String name;
	protected int power;
	protected int hp;
	public String getName() {
		return name;
	}
	public int getPower() {
		return power;
	}
	public int getHp() {
		return hp;
	}
	
	public Hero(String name, int power, int hp) {
		super();
		this.name = name;
		this.power = power<= 0? 0:power;
		this.hp = hp<1?1:hp;
	}
	public int takeDamage(int damage) {
		
		damage = damage <0? 0:damage;
	    int ans = hp < damage? hp :damage;
		hp -=damage;
		hp =hp<0? 0:hp;
		//System.out.println(hp < damage? hp :damage);
		return ans;
	}
	public int doDamage(Hero target) {
		return target.takeDamage(power);
		
	}
	public boolean isDefeated() {
		return hp<=0 ? true:false;
	}
	public String printStat() {
		//System.out.println("[atk:"+power+"hp:"+hp+"]");
		return "[atk:"+power+" hp:"+hp+"]";
	}

}
