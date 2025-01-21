package org.example.Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Selenium012 {

    @Test
    public void window(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        String parentwindow=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        String child=driver.getWindowHandle();
        if (driver.getPageSource().contains("New Window")) {
            System.out.println("Test passed");
        }
            //driver.switchTo().window(parentwindow);
//        Set<String> windownhandles=driver.getWindowHandles();
//
//        for(String handle:windownhandles){
//            driver.switchTo().window(handle);
//            if ((driver.getPageSource().contains("New Window"))){
//                System.out.println("Testcase passes !");
//                break;
            }
        }




