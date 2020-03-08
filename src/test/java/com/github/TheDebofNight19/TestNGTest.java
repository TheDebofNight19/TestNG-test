package com.github.TheDebofNight19;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TestNGTest {
    private static final Logger LOG = LoggerFactory.getLogger(TestNGTest.class);

    @Test
    public void test1(){
        LOG.info("This is a testNG test!");
    }
}
