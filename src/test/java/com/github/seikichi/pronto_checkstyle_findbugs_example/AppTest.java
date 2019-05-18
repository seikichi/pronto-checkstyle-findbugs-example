package com.github.seikichi.pronto_checkstyle_findbugs_example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test public void testAppHasAGreeting() {
    final App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }
}
