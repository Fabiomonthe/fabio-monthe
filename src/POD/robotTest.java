package POD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class robotTest {

	@Test
	void testFire() {
		robot a = new robot();
		robot b = new robot();
		
		a.fire(b);
	}
	
	

}
