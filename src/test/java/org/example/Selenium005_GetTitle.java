package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Selenium005_GetTitle  {

    @Test
    public void test006(){
        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // get Title
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
        //get Current Url
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        // Pagesource String
        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Heading not found");
        }
        driver.quit();
    }
}
