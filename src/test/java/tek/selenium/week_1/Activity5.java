package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.chrono.ThaiBuddhistEra;

public class Activity5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/");
        Thread.sleep(3000);

        By inputLinkLocator = By.linkText("Inputs");
        WebElement inputLinkElement = driver.findElement(inputLinkLocator);
        inputLinkElement.click();

        By rangeInputLocator = By.id("rangeInput");
        WebElement rangeInputElement =driver.findElement(rangeInputLocator);
        for(int i =0; i<15; i++){
            rangeInputElement.sendKeys(Keys.ARROW_RIGHT);
        }

    }
}
