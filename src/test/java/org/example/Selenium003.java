package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium003 {

    @Test
    public void test1(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addExtensions(new File("C:\\Users\\panka\\IdeaProjects\\Selenium\\src\\test\\java\\org\\example\\Adblocker.crx"));

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/");
        driver.quit();

    }
}
