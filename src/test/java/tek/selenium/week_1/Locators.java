package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
//        locate, find and take action - three steps
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
//        to locate an element we have 8 options
        //Locating Username Element in Web Page and enter a value.
        //id , name , className, tagName, linkName, partialLinkName, xpath , css
        //1) locate with one of the options
        By usernameInputLocator =  By.name("username");
        //2) find element by selenium
        WebElement usernameElement = driver.findElement(usernameInputLocator);
        //3) take action with element.
        //using sendkey method with enter value to input field
        usernameElement.sendKeys("morty");

        By passwordLocator = By.name("password");
        //2) Find the element with driver.
        WebElement passwordElement = driver.findElement(passwordLocator);
        //3) perform action -> send text to input
        passwordElement.sendKeys("pass");

        //Clicking on button
        By loginButtonlocator =By.id("loginButton");
        WebElement loginButtonElement =driver.findElement(loginButtonlocator);
        loginButtonElement.click();
        Thread.sleep(3000);

        //Using className for locator.
        By errorMsg = By.className("error");
        WebElement errorElement = driver.findElement(errorMsg);
        String errorText = errorElement.getText();
        System.out.println(errorText);

        driver.quit();

    }
}
