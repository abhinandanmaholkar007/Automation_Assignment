package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.className("blinkingText")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String>it=windows.iterator();
        String parentWindow=it.next();
        String childWindow= it.next();
        driver.switchTo().window(childWindow);
        String emailId=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0].trim();
        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}
