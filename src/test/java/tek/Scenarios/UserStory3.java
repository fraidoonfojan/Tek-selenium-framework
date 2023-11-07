package tek.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStory3 {
    public static void main(String[] args)throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        Thread.sleep(2000);

//        By usernameLocator = By.tagName("username");
//        WebElement usernameElement = driver.findElement(usernameLocator);
//        usernameElement.sendKeys("wrong username");
        // second approach:
        driver.findElement(By.name("username")).sendKeys("wrong username");

        By passwordLocator=By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("wrong password");

        By loginButtonLocator = By.id("loginButton");
        WebElement loginElement = driver.findElement(loginButtonLocator);
        loginElement.click();
        Thread.sleep(1000);

//        driver.findElement(By.name("password")).sendKeys("wrong password");
        By errorMsg = By.className("banner");
        WebElement errorElement = driver.findElement(errorMsg);
        String errorText = errorElement.getText();
        String actualText = "User not found";
        if(actualText.equals(errorText)) {
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.quit();



    }
}
