
package Jala.java.selenium.magnus.TestNG;


import org.testng.annotations.*;

public class TestNGAnnotation {

    @BeforeSuite
    public void testBeforeSuite() {

        System.out.println("In BeforeSuite Annotation");
    }

    @BeforeTest
    public void testBeforeTest() {

        System.out.println("In BeforeTest Annotation");
    }

    @BeforeClass
    public void testBeforeClass() {

        System.out.println("In BeforeClass Annotation");
    }

    @BeforeMethod
    public void testBeforeMethod() {

        System.out.println("In BeforeMethod Annotation");
    }


    @BeforeGroups
    public void testBeforeGroups() {

        System.out.println("In BeforeGroups Annotation");
    }

    @AfterSuite
    public void testAfterSuite() {

        System.out.println("In Before Test Annotation");
    }

    @AfterTest
    public void testAfterTest() {

        System.out.println("In AfterTest Annotation");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("In AfterClass Annotation");
    }

    @AfterMethod
    public void testAfterMethod() {

        System.out.println("In AfterMethod Annotation");
    }
    @AfterGroups
    public void testAfterGroups() {

        System.out.println("In AfterGroups Annotation");
    }

    @Test
    public void testAnnotations() {

        System.out.println(" Test Script to test the TestNG annotations ORDER");
    }

}
