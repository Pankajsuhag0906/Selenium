package org.example.Task.Dec232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium008 {

    @Test
    public void test008() throws InterruptedException {
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement Username=driver.findElement(By.name("firstname"));
        Username.sendKeys("Pankaj");

        WebElement Lastname=driver.findElement(By.name("lastname"));
        Lastname.sendKeys("Suhag");

        WebElement Gender=driver.findElement(By.id("sex-0"));
        Gender.click();

        WebElement Experience=driver.findElement(By.id("exp-1"));
        Experience.click();

        WebElement date=driver.findElement(By.id("datepicker"));
        date.sendKeys("29/12/2024");

        WebElement Prof1=driver.findElement(By.id("profession-0"));
        Prof1.click();

        WebElement tool=driver.findElement(By.id("tool-0"));
        tool.click();

        Thread.sleep(1000);
        driver.quit();

    }
}
