package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		JunitTest junit =new JunitTest();
		int re=junit.addnumbers(100,200);
		assertEquals(300,re);
	}

}
