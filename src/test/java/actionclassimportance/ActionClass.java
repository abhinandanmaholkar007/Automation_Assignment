package actionclassimportance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions action=new Actions(driver);
      //  action.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).build().perform();
        WebElement enterTextInCapital=driver.findElement(By.id("twotabsearchtextbox"));
        action.moveToElement(enterTextInCapital).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        WebElement move= driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        action.moveToElement(move).contextClick().build().perform();
    }
}
