package item.items;

import hero.Hero;

// You CAN modify the first line
public class RingOfHealth extends item.base.Item{
	public int hpPercentageBonus;
	private int bonusHp=0;
	public RingOfHealth(int hpPercentageBonus) {
		// use the given name and description
		super("Orb of Health (+" + hpPercentageBonus + "%)","increase hp by " + hpPercentageBonus + "%");
		//String name = "Orb of Health (+" + hpPercentageBonus + "%)";
		//String description =  "increase hp by " + hpPercentageBonus + "%";
		this.hpPercentageBonus=hpPercentageBonus;
	}
	public void applyBonuses(Hero hero) {
		bonusHp=(int) ((int)hero.getHp()*((double)hpPercentageBonus/100.0));
		
		hero.setHp(hero.getHp()+bonusHp);
	}
	public void unapplyBonuses(Hero hero) {
		
		hero.setHp(hero.getHp()-bonusHp);
	}
}
