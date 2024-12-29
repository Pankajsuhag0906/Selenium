package org.example.Task.Dec232024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium007 {

    @Test
    public void test01() throws InterruptedException {

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement Mkappointment=driver.findElement(By.linkText("Make Appointment"));
        Mkappointment.click();

        WebElement username=driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement pass=driver.findElement(By.id("txt-password"));
        pass.sendKeys("ThisIsNotAPassword");

        WebElement btnlog=driver.findElement(By.id("btn-login"));
        btnlog.click();

        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
