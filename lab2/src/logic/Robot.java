package logic;

public class Robot extends Hero{

	public Robot(String name) {
		super(name, 2, 10);
		
	}
	public int doDamage(Hero target) {
		if(target instanceof Tank) {
			Tank t = (Tank)target;
			return t.takePiercingDamage(2);
		}
		return target.takeDamage(2);
		
	}
	

}
