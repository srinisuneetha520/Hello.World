package Programming;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest1 {

	@Test
	public void Addtest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(100, 200);
		assertEquals(300,result);
	}

}
