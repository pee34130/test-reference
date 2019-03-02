package item.items;

import hero.Hero;
import item.base.UpgradableItem;

public class BookOfEvil extends item.base.UpgradableItem{
	private int level=0;
	int bonusAttack=10;
	int realBonusAttack=0;
	public BookOfEvil() {
		// use the given name and description
		super("Book of Evil","A book containing evil knowledges, can store infinitely many pages");
		String name = "Book of Evil";
		String description = "A book containing evil knowledges, can store infinitely many pages";
	}
	public void  applyBonuses(Hero hero) {
		realBonusAttack=bonusAttack+(3*level);
		hero.setAttack(hero.getAttack()+realBonusAttack);
		
	}
	public void  unapplyBonuses(Hero hero) {
		
		hero.setAttack(hero.getAttack()-realBonusAttack);
		
	}
	public void upgrade() {
		level++;
	}
	public int getUpgradeLevel() {
		return level;
	}
}
