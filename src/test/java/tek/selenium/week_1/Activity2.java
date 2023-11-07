package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to link https://tek-retail-ui.azurewebsites.net/selenium
        click on Inputs
        then fill the form text, email, password
        * */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        By inputsLink = By.linkText("Inputs");
        WebElement inputsClickElement = driver.findElement(inputsLink);
        inputsClickElement.click();

        By fillTextLocator = By.name("text");
        WebElement fillTextElement = driver.findElement(fillTextLocator);
        fillTextElement.sendKeys("working on a text case");

        By fillEmailLocator = By.id("emailInput");
        WebElement fillEmailElement = driver.findElement(fillEmailLocator);
        fillEmailElement.sendKeys("rickmorty@gmail.com");

        By fillPasswordLocator =By.name("password");
        WebElement fillPasswordElement = driver.findElement(fillPasswordLocator);
        fillPasswordElement.sendKeys("tomohardy");
        Thread.sleep(5000);
        driver.quit();


    }
}
