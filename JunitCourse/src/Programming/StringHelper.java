package Programming;


import static org.junit.Assert.*;
	import org.junit.Before;
	import org.junit.Test;

		public class StringHelper {

			// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

			StringHelper helper;
			
			@Before
			public void before(){
				helper = new StringHelper();
			}
			

			@Test
			public void testTruncateAInFirst2Positions_AinFirst2Positions() {
				assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
			}

			Object truncateAInFirst2Positions(String string) {
				// TODO Auto-generated method stub
				return null;
			}


			@Test
			public void testTruncateAInFirst2Positions_AinFirstPosition() {
				assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
			}

			// ABCD => false, ABAB => true, AB => true, A => false
			@Test
			public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
				assertFalse( 
						helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
			}

			private boolean areFirstAndLastTwoCharactersTheSame(String string) {
				// TODO Auto-generated method stub
				return false;
			}


			@Test
			public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
				assertTrue( 
						helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
			}

			
		}


