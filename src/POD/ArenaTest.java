package POD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArenaTest {

	@Test
	void testFight() {
		robot r1 = new robot("ronaldo",10);
		robot r2= new robot("messi",10);
		Arena A= new Arena (r1,r2);
		
		A.fight(r1,r2);
	}
           
}
