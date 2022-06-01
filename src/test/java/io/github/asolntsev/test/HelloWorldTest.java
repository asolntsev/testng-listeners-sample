package io.github.asolntsev.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomSoftAssert.class)
public class HelloWorldTest {
    @Test
    public void someCustomSoftAsserts() {
        // doing custom soft asserts
        // which will trigger test failure in listener
    }
}
