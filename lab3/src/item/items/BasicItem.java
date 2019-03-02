package item.items;

import hero.Hero;
import item.base.Item;

// You CAN modify the first line
public class BasicItem extends item.base.Item{
	int hpBonus,  attackBonus,  defenseBonus;
	public BasicItem(String name, String description,  int hpBonus, int attackBonus,int defenseBonus) {
		super(name, description);
		this.hpBonus = hpBonus;
		this.attackBonus = attackBonus;
		this.defenseBonus = defenseBonus;
	}
	 public void applyBonuses(Hero hero) {
		 hero.setAttack(hero.getAttack()+attackBonus);
		 hero.setDefense(hero.getDefense()+defenseBonus);
		 hero.setHp(hero.getHp()+hpBonus);
		 
	 }
	 public void unapplyBonuses(Hero hero) {
		 hero.setAttack(hero.getAttack()-attackBonus);
		 hero.setDefense(hero.getDefense()-defenseBonus);
		 hero.setHp(hero.getHp()-hpBonus);
		 
	 }
	

	
}
