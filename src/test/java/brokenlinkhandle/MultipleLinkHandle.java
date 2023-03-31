package brokenlinkhandle;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static dev.failsafe.internal.util.Assert.*;

public class MultipleLinkHandle {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> allLinks=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
        for (WebElement link:allLinks)
        {
          String url=link.getAttribute("href");
            HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responseCode=conn.getResponseCode();
            System.out.println(responseCode);
            Thread.sleep(5000);
            if(responseCode>400)
            {
                //hard assert
                Assertions.assertTrue(false);
            }
        }

    }
}
