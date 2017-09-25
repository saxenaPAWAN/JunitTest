package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStr {

	@Test
	public void test() {
		JunitTest junit1 =new JunitTest();
		String re=junit1.addStr("Pawan ","Saxena");
		assertEquals("Pawan Saxena",re);

	}

}
