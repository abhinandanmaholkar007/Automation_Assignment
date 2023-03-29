package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SpiceJet {
    public static void main(String[] args) throws InterruptedException {
        String expectedUrl="https://rahulshettyacademy.com/dropdownsPractise";
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
             Thread.sleep(3000);
        List<WebElement> countryDropdownList=driver.findElements(By.className("ui-menu-item"));
        Iterator<WebElement> countryList =countryDropdownList.iterator();
        while (countryList.hasNext()) {
            WebElement element=countryList.next();
            //System.out.println(element.getText());
            if(element.getText().equalsIgnoreCase("India"))
            {
                element.click();
            }
        }

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.cssSelector("a[value='BHO']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='GAU']")).click();


    //    for( WebElement countryOptions:countryDropdownList)
//        {
//            if(countryOptions.getText().equalsIgnoreCase("india")) {
//                countryOptions.click();
//                break;
//            }
        }

    }

