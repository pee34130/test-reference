package blacksmith;

import logic.Hero;

public class Blacksmith extends Hero{
	private Sword sword = new Sword(1,1) ;
	private int skillLevel;
	public Blacksmith(String name, int hp,int skillLevel) {
		super(name, 1, hp);
		this.skillLevel=skillLevel;
	
		// TODO Auto-generated constructor stub
	}
	public Blacksmith() {
		super("DefaultBlacksmith", 1, 1);
		this.skillLevel=1;
		// TODO Auto-generated constructor stub
	}
	public int doDamage(Hero target) {
		int ans=target.takeDamage(+sword.getAttack());
		upgradeSword();
		return ans;
		
	}
	public void upgradeSword() {
		sword.upgrade(skillLevel);
	}
	public String printStat() {
		//System.out.println("[atk:"+power+"hp:"+hp+"]");
		return "[hp:"+hp+"lvl:"+skillLevel+"]";
	}
	
	

}
