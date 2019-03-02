package item.items;

import hero.Hero;

// You CAN modify the first line
public class AngelsArmor extends item.base.UpgradableItem{
	private int level=1,bonusDef=0,bonusHp=0,bonusAtt=0;
	public AngelsArmor() {
		// use the given name and description
		super("Angel's Armor","Armor wielded by Heaven's people");
		String name = "Angel's Armor";
		String description = "Armor wielded by Heaven's people";
	}
	public int getLevel() {
		return level;
	}
	public void upgrade() {
		if(level<=2)level++;
	}
	public int getUpgradeLevel() {
		return level;
	}
	public void  applyBonuses(Hero hero) {
		switch(level) {
		case 1:
			bonusDef=10;
			bonusHp =0;
			bonusAtt =0;
			break;
		case 2:
		{
			bonusDef=27;
			bonusHp =233;
			bonusAtt =0;
			break;
			
		}
		case 3:
		{
			bonusDef=46;
			bonusHp =326;
			bonusAtt =23;
			break;
			
		}
		}
		hero.setAttack(hero.getAttack()+ bonusAtt);
		hero.setDefense(hero.getDefense()+bonusDef);
		hero.setHp(hero.getHp()+bonusHp);
		
	}
	public void  unapplyBonuses(Hero hero) {
		hero.setAttack(hero.getAttack()- bonusAtt);
		hero.setDefense(hero.getDefense()-bonusDef);
		hero.setHp(hero.getHp()-bonusHp);
		
		
	}
	
	
}
