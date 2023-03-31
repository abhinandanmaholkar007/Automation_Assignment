package brokenlinkhandle;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlethroughSoftAssert {
    public static void main(String[] args) throws IOException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        SoftAssert a=new SoftAssert();
        List<WebElement> footerLinks=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
        for (WebElement footerlink:footerLinks)
        {
            String url=footerlink.getAttribute("href");
            HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responseCode=conn.getResponseCode();
            System.out.println(responseCode);
            a.assertTrue(responseCode<400,"The link with text "+footerlink.getText()+ " is broken with code "+responseCode);
        }
        a.assertAll();

    }
}
