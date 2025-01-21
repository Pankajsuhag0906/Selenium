package org.example.Webtable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium010 {

    @Test
    public void WBtable(){
        String URL="https://awesomeqa.com/webtable1.html";
        WebDriver driver=new ChromeDriver();
        driver.get(URL);

        WebElement table=driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        List<WebElement> rows_table=table.findElements(By.tagName("tr"));
        int row=rows_table.size();
        for(int i=0;i<row;i++)
        {
         List<WebElement> col=rows_table.get(i).findElements(By.tagName("td"));

         for (WebElement c:col){
             System.out.println(c.getText());
         }
        }
        driver.quit();
    }
}
