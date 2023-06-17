package Jala.java.selenium.magnus.Scenarios;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
public class IFrame {
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
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
        Thread.sleep(1000);
    }
    @Test (priority = 2)
    public void iFrame() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='More']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='iFrames']")).click();
        Thread.sleep(1000);
        //Creating an object of list webelement to capture the iframe elements by suing tagname
        List<WebElement> iframeelements = driver.findElements(By.tagName("iframe"));
        //to determine the no of iframe elements
        System.out.println("No. fo iframes are: "+iframeelements.size());
        Thread.sleep(1000);
        //switching to frame 1
        driver.switchTo().frame(1);
        Thread.sleep(1000);
        //clicking the button inside the iframe
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        Thread.sleep(1000);
    }

    @Test (priority = 11)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}