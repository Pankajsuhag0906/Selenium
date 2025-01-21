package org.example.Task.Jan032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.*;

public class Project_CRM {

    @Test
    public void Test010() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.us.espocrm.com/?l=en_US#Account");
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.id("btn-login"));
        login.click();
        Thread.sleep(10000);
        WebElement element= driver.findElement(By.xpath("//span[contains(text(),\"Create Account\")]"));
        element.click();

        Thread.sleep(3000);
        WebElement name= driver.findElement(By.xpath("//input[@data-name=\"name\"]"));
        name.sendKeys("Pankaj");
        WebElement web= driver.findElement(By.xpath("//input[@data-name=\"website\"]"));
        web.sendKeys("Pankajsuhag.com");

        WebElement email= driver.findElement(By.xpath("//input[@type=\"email\"]"));
        email.sendKeys("Pankajsuhag494@gmail.com");

        WebElement phone=driver.findElement(By.xpath("//span[@class=\"input-group-item input-group-item-middle\"]/input"));
        phone.sendKeys("7404482407");

        WebElement Billadd= driver.findElement(By.xpath("//textarea[@data-name=\"billingAddressStreet\"]"));
        Billadd.sendKeys("604E/34");

        WebElement Billaddcity= driver.findElement(By.xpath("//input[@data-name=\"billingAddressCity\"]"));
        Billaddcity.sendKeys("Rohtak");

        WebElement Billaddstate= driver.findElement(By.xpath("//input[@data-name=\"billingAddressState\"]"));
        Billaddstate.sendKeys("Haryana");

        WebElement Billaddpc= driver.findElement(By.xpath("//input[@data-name=\"billingAddressPostalCode\"]"));
        Billaddpc.sendKeys("124001");
        WebElement Billaddcountry= driver.findElement(By.xpath("//input[@data-name=\"billingAddressCountry\"]"));
        Billaddcountry.sendKeys("India");



        WebElement Shipadd= driver.findElement(By.xpath("//textarea[@data-name=\"shippingAddressStreet\"]"));
        Shipadd.sendKeys("604E/34");

        WebElement city= driver.findElement(By.xpath("//input[@data-name=\"shippingAddressCity\"]"));
        city.sendKeys("Rohtak");
        WebElement state= driver.findElement(By.xpath("//input[@data-name=\"shippingAddressState\"]"));
        state.sendKeys("Haryana");
        WebElement Pcode= driver.findElement(By.xpath("//input[@data-name=\"shippingAddressPostalCode\"]"));
        Pcode.sendKeys("124001");
        WebElement Country= driver.findElement(By.xpath("//input[@data-name=\"shippingAddressCountry\"]"));
        Country.sendKeys("India");

        WebElement AssignUser=driver.findElement(By.xpath("//button[@data-action=\"selectLink\"]"));
        AssignUser.click();
         Thread.sleep(2000);
        WebElement name1=driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr/td/img/following-sibling::a"));
        name1.click();

        //div[@class="input-group add-team"]/span/button

        WebElement teams=driver.findElement(By.xpath("//div[@class=\"input-group add-team\"]/span/button"));
        teams.click();

        Thread.sleep(2000);
        WebElement selectteam= driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr/td/span/input"));
        selectteam.click();

        WebElement slctbutton=driver.findElement(By.xpath("//div[@class=\"btn-group main-btn-group\"]/button[@class=\"btn btn-danger btn-xs-wide radius-left\"]"));
        slctbutton.click();



//     //   WebElement elementselect=driver.findElement(By.xpath("//select[@data-name=\"type\"]"));
//       // List<WebElement> item_list= driver.findElement(By.xpath("//div[@class=\"item\"]"));
//        Actions action=new Actions(driver);
//          action.moveToElement(item_list).click().build().perform();
//       // Select select=new Select(elementselect);
//        //select.selectByVisibleText("Investor");
    }
}
