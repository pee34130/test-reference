package blacksmith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwordTest {

	// TODO Create Sword for each test case for more convenient
	@BeforeEach
	void setUp() throws Exception {

	}

	// TODO Test Sword constructor
	@Test
	void testSword() {
		
	}

	// TODO Test Sword constructor with negative attack
	@Test
	void testSwordNegativeAttack() {
		Sword A =new Sword(-3,5);
		 assertEquals(1,A.getAttack());

	}

	// TODO Test Sword constructor with negative durability
	@Test
	void testSwordNegativeDurability() {
		Sword A =new Sword(3,-5);
		assertEquals(1,A.getDurability());
	}

	// TODO Test upgrade()
	@Test
	void testUpgrade() {
		Sword A =new Sword(3,5);
		A.upgrade(4);
		assertEquals(6,A.getDurability());
		assertEquals(7,A.getAttack());
	}

	// TODO Test upgrade() with negative value
	@Test
	void testUpgradeNegative() {
		Sword A =new Sword(3,5);
		A.upgrade(-4);
		assertEquals(6,A.getDurability());
		assertEquals(3,A.getAttack());
	}

	// TODO Test doParry()
	@Test
	void testDoParry() {
		Sword c =new Sword(3,3);
		assertEquals(3, c.doParry(6));
		assertEquals(2, c.getDurability());
	}

	// TODO Test doParry() with non positive attack
	@Test
	void testDoParryNonPositiveAttack() {
		Sword c =new Sword(3,3);
		assertEquals(0, c.doParry(-100));
		assertEquals(2, c.getDurability());
	}

	// TODO Test doParry() with attack <= Sword's attack ( fully parried )
	@Test
	void testDoParryFullyParried() {
		Sword c =new Sword(1,3);
		assertEquals(0, c.doParry(1));
		assertEquals(2, c.getDurability());
	}

	// TODO Test isBroken()
	@Test
	void testIsBroken() {
		Sword c =new Sword(1,1);
		Sword d =new Sword(3,3);
		c.doParry(1);
		assertTrue(c.isBroken());
		assertFalse(d.isBroken());
	}

}
