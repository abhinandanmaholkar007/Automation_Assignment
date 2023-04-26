package webtablesortingusingstream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class WebTableSortingUsingJavaStream {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //1. Click on the column
        driver.findElement(By.xpath("//tr/th[1]")).click();

        //2. Capture all webelement into list
        List<WebElement> veglist=driver.findElements(By.xpath("//tr/td[1]"));

        //3. capture text of all webelement into new(original list) list
        List<String> originalList=veglist.stream().map(s->s.getText()).collect(Collectors.toList());
        System.out.println(originalList);

        //4. sort the list---->Sorted list
        List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
        //5. Compare original and sorted list
        Assert.assertTrue(originalList.equals(sortedList));

        //6. Scan the column name with getText>beans>print the price of beans
    List<String>price=veglist.stream().filter(s->s.getText().contains("Banana")).map(s->getPriceVeggies(s)).collect(Collectors.toList());
     price.forEach(a-> System.out.println(a));

    }

    private static String getPriceVeggies(WebElement s) {
    String priceValue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
    return priceValue;
    }
}
