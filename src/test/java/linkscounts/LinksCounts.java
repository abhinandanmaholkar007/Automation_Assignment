package linkscounts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LinksCounts {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerLink=driver.findElement(By.id("gf-BIG"));
        System.out.println(footerLink.findElements(By.tagName("a")).size());
        List<WebElement> links=footerLink.findElements(By.tagName("a"));

   //     for (WebElement footerLinks:links)
     //   {
       //     System.out.println(footerLinks.getText());
        //}

        WebElement discountCouponLinks=footerLink.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
       List<WebElement> individualLinkclick=discountCouponLinks.findElements(By.tagName("a"));
        for (WebElement clickOnLink:individualLinkclick) {
            String l = Keys.chord(Keys.CONTROL, Keys.ENTER);
            clickOnLink.sendKeys(l);
        }
        Thread.sleep(3000);

        Set<String> it1=driver.getWindowHandles();
        Iterator<String> it=it1.iterator();

        while (it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        }
    }

