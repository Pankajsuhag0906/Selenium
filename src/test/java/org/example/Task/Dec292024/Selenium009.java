package org.example.Task.Dec292024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class Selenium009 {

    @Test
    public void test09() throws InterruptedException {

        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);
        WebElement usrname= driver.findElement(By.xpath("//input[@id='username']"));
        usrname.sendKeys("augtest_040823@idrive.com");

        WebElement pass= driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("123456");

        WebElement Sign= driver.findElement(By.xpath("//button[@id='frm-btn']"));
        Sign.click();

        Thread.sleep(25000);
        WebElement title= driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        assertThat(title.getText()).isEqualTo("Your free trial has expired");
    }
}
