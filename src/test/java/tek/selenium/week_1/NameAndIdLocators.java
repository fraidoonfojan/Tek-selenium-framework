package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameAndIdLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        Thread.sleep(3000);

        //1. locate the element with By
        driver.findElement(By.name("username")).sendKeys("kelowna");
        driver.findElement(By.name("password")).sendKeys("calgary");
        driver.findElement(By.id("loginButton")).click();


        Thread.sleep(3000);
        driver.quit();


    }
}
