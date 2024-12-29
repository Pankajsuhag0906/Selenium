package org.example.Selelium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium006 {

    @Test
    public void test001() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        WebElement username=driver.findElement(By.id("login-username"));
        username.sendKeys("Admin@gmail.com");

        WebElement password=driver.findElement(By.id("login-password"));
        password.sendKeys("Maxwell@44");

        WebElement btnSignin=driver.findElement(By.id("js-login-btn"));
        btnSignin.click();
        Thread.sleep(3000);

        WebElement notification=driver.findElement(By.id("js-notification-box-msg"));
        assertThat(notification.getText()).isEqualTo("Your email, password, IP address or location did not match");

        driver.quit();
    }

}
