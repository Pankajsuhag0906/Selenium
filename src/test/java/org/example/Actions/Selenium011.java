package org.example.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.beans.Visibility;
import java.time.Duration;

public class Selenium011 {

    @Test
    public void Actionss() throws InterruptedException {

    String URL="https://www.makemytrip.com/";
    WebDriver driver=new EdgeDriver();
    driver.get(URL);
    driver.manage().window().fullscreen();

        //span[@data-cy="closeModal"]
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
    WebElement close= driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
    close.click();

   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for=\\\"fromCity\\\"]\"")));
    WebElement fromlabel=driver.findElement(By.xpath("//label[@for=\"fromCity\"]"));

        Actions action=new Actions(driver);
        action.moveToElement(fromlabel).click().build().perform();

        Thread.sleep(2000);
        WebElement from=driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
        action.moveToElement(from).click().sendKeys("del").build().perform();
        Thread.sleep(2000);
        action.moveToElement(from).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();





    }
}
