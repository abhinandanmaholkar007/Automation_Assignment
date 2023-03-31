package brokenlinkhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrokenLinkHandle {
    public static void main(String[] args) throws IOException, InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url=driver.findElement(By.xpath("//a[text()='Broken Link']")).getAttribute("href");
        System.out.println(url);
        Thread.sleep(4000);
        HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        int statusCode=conn.getResponseCode();
        System.out.println(statusCode);
    }
}
