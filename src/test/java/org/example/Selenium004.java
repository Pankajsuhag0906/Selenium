package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium004 {

    @Test
    public void test02(){

        WebDriver driver=new EdgeDriver();
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().to("https://app.eraser.io/workspace/gAY5BedoQPtNX15ffrWo");
        driver.navigate().back();
        driver.navigate().forward();
        
        driver.quit();

    }
}
