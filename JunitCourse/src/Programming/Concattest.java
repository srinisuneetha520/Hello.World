package Programming;

import static org.junit.Assert.*;

import org.junit.Test;

public class Concattest {

	@Test
	public void ConCattest(){
		MyJunitClass junit = new MyJunitClass();
		String  result = junit.Concat("hello", "world");
		assertEquals("helloworld",result);

}}

