package Jala.java.selenium.magnus.Scenarios;

import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

public class BrokenLink {

    WebDriver driver;
    void verifyLinks(String linkUrl) {
        try
        {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() == 200)
            {
                System.out.println(linkUrl + "-" + httpURLConnect.getResponseMessage());
            }
            else
            {
                if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND)
                {
                    System.out.println(linkUrl + "-" + httpURLConnect.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);
                }
            }
        }
        catch (Exception e)
        {

        }
    }

    @Test(priority = 0)
    public void launch() throws InterruptedException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void initilize() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='More']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Links']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Broken Links']")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void findBrokenLink() throws InterruptedException {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are : " + links.size());
        System.out.println("Verified link");
        for (int i = 0; i < links.size(); i++) {
            WebElement ele = links.get(i);
            String url = ele.getAttribute("href");
            verifyLinks(url);
        }
        Thread.sleep(1000);
        driver.quit();
    }
}