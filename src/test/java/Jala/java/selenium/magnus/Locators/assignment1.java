package Jala.java.selenium.magnus.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class assignment1 {

    WebDriver driver;
    @Test(priority = 0)
    public void launch() throws InterruptedException{
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void locate() throws InterruptedException {
		driver.findElement(By.id("UserName"));
		driver.findElement(By.linkText("Admin Login"));
		driver.findElement(By.className("login-box-body"));
		driver.findElement(By.name("Password"));
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));

    }
    @Test(priority = 2)
    public void autoscript() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com"); // 1st Automation
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram"); // 2nd Automation
		Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click(); // 3rd Automation
		Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click(); // 4th Automation
		Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click(); // 5th Automation
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("vanll"); // 6th Automation
		Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnSearch']")).click(); // 7th Automation
		Thread.sleep(1000);

    }
    @Test(priority = 3)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
		driver.quit();
    }

}
