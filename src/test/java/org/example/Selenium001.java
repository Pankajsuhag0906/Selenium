package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium001 {

    @Test
    public void Selenium001() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
       // driver.wait(3000);
        driver.quit();


    }
}
