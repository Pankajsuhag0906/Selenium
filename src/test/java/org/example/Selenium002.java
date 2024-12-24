package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium002 {

    @Test
    public void Selenium001() throws InterruptedException {

        EdgeOptions edgeOptions=new EdgeOptions();
       // edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.google.com/");
       // driver.wait(3000);
        driver.quit();

    }
}
