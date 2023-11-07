package tek.selenium.week_1;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseLocator2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");
        Thread.sleep(4000);

        By inputsLinkLocator = By.linkText("Inputs");
        WebElement inputsLinkElement = driver.findElement(inputsLinkLocator);
        inputsLinkElement.click();
        Thread.sleep(3000);
        driver.quit();


    }
}
