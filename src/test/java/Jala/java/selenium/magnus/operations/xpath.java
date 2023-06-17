package Jala.java.selenium.magnus.operations;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.Color;
import org.testng.annotations.*;

import java.util.*;
public class xpath {
    WebDriver driver;

    @Test(priority = 0)
    public void launch() throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test (priority = 1)
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='checkmark']")).click();
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void testcase1() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='More']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Links']")).click();
        Thread.sleep(1000);
        WebElement t = driver.findElement(By.xpath("//a[@href='http://www.workinglinks.co.uk/']"));
        String s = t.getCssValue("color");
        System.out.println("color value is "+s);
        String l = Color.fromString(s).asHex();
        System.out.println("Hex value for that color is "+l);
    }

    @Test (priority = 3)
    public void testcase2() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Aftab");
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//div[@class='box box-info']//form")).getAttribute("Value"));
    }

    @Test (priority = 11)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
