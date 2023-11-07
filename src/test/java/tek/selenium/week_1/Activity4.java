package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4 {
    public static void main(String[] args)throws InterruptedException {
//        Navigate to google.com and search for something

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        By googleSearchLocator =By.name("q");
        WebElement searchElement = driver.findElement(googleSearchLocator);
        searchElement.sendKeys("what is API");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(5000);

        driver.quit();


    }
}
