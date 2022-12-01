package POD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class robotTest2 {

	@Test
	void testIsDead() {
		robot a = new robot("john", 10);
		robot b = new robot("bob",0);
		
		a.fire(b);
	}
	

}
