package calendar;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JavaScriptScrollingOperation {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js= (JavascriptExecutor )driver;
        js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(3000);

        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for (int i=0; i<values.size();i++)
        {
         sum=sum+Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
      //  System.out.println(driver.findElement(By.className(".totalAmount")).getText());
       // int total= Integer.parseInt(driver.findElement(By.className(".totalAmount")).getText().split(":")[1].trim());
       // Assert.assertEqual(sum, total);
    }
}
