package com.github.TheDebofNight19;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestNGTest.class);

    @Test
    public void test1(){
        LOG.info("This is a testNG test!");
    }

    /**
     * Параметризованный тест
     * @return
     */

    @DataProvider(name = "Data Provider")
    public Object[] dataProvider(){

        return new Object[][]{
                {"Test No", 1},
                {"Test No", 2}
        };
    }

    @Test(dataProvider = "Data Provider")
    public void test2(String test, int num){
        LOG.info("This is another testNG test!");
        String print = String.format("TEST: %s | NOM: %d", test, num);
        System.out.println(print);
    }
}
