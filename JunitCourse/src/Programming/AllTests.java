package Programming;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddTest1.class, AllTests.class, ArraysCompareTest.class, Concattest.class, QuickBeforeAfterTest.class,
		StringHelper.class, StringHelperParameterizedTest.class })

public class AllTests {

}
