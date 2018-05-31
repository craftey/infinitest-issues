package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Craftey
 */
public class TestWithDataProvider {

    @DataProvider
    private Object[][] data() {
        return new Object[][] { { "foo" } };
    }

    @Test(dataProvider = "data")
    public void minimalDataProviderTest(String param) {
    }

}
