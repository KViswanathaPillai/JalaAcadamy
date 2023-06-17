package Jala.java.selenium.magnus.Scenarios;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;


import javax.xml.crypto.Data;

public class screenShot {
    WebDriver driver;
    @Test(priority = 0)
    public void screenShot() throws IOException {
        Date crntdate = new Date();
        String clip = crntdate.toString().replace(" ", "-").replace(":", "-");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        //creating an object of File class to store the screenshot and adding casting
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //saving the screenshot as png format in a folder
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+ clip +".png"));
        driver.quit();

    }
}