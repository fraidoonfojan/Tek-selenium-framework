package tek.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonEnabled {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        Thread.sleep(2000);

        By loginButtonLocator = By.id("loginButton");
        WebElement buttonElement = driver.findElement(loginButtonLocator);
        boolean isDisabled = buttonElement.isEnabled();
        if(!isDisabled) {
            System.out.println("button is disabled");
        }else{
            System.out.println("button enabled");
        }

        driver.findElement(By.name("username")).sendKeys("calgary");
        driver.findElement(By.name("password")).sendKeys("kelowna");
        Thread.sleep(1000);
        boolean isEnabled= buttonElement.isEnabled();
        if(isEnabled) {
            System.out.println("Button enabled");
        }else{
            System.out.println("Button disabled");
        }

        driver.quit();


    }
}
