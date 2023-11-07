package tek.Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {
//    User Story #2
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        driver.quit();
        if(actualTitle.equals("Tek Insurance Service")) {
            System.out.println("Test passed");
        }else
            System.out.println("Test failed");
        System.out.println("Expecting to be Tek Insurance Service "+ "but it was "+actualTitle);
        }


    }

