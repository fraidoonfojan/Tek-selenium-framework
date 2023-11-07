package tek.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStory4 {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("Supervisor");
        driver.findElement(By.name("password")).sendKeys("invalidPassword");

        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(2000);
        By errorMsg = By.className("error");
        WebElement errorMsgElement = driver.findElement(errorMsg);
        String errorText = errorMsgElement.getText();

        String actualText = "Password Not Matched";
        if(errorText.equals(actualText)) {
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        driver.quit();
    }
}
