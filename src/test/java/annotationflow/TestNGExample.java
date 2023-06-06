package annotationflow;

import org.testng.annotations.*;

public class TestNGExample {
        @BeforeSuite
        public void setupBeforeSuite() {
            System.out.println("Before Suite");
        }

        @AfterSuite
        public void teardownAfterSuite() {
            System.out.println("After Suite");
        }

        @BeforeTest
        public void setupBeforeTest() {
            System.out.println("Before Test");
        }

        @AfterTest
        public void teardownAfterTest() {
            System.out.println("After Test");
        }

        @BeforeClass
        public void setupBeforeClass() {
            System.out.println("Before Class");
        }

        @AfterClass
        public void teardownAfterClass() {
            System.out.println("After Class");
        }

        @BeforeMethod
        public void setupBeforeMethod() {
            System.out.println("Before Method");
        }

        @AfterMethod
        public void teardownAfterMethod() {
            System.out.println("After Method");
        }

        @Test(priority = 1)
        public void testMethod1() {
            System.out.println("Test Method 1");
            // Perform test actions and assertions here
        }

        @Test(priority = 2)
        public void testMethod2() {
            System.out.println("Test Method 2");
            // Perform test actions and assertions here
        }

    }

