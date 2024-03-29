package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
//    Navigate to Insurance app
//    print page title
//    print customer service portal title
//    print second section title (Login)
//    Enter WrongUser Name
//    Enter Wrong password
//    Click login
//    Print error message.
        public static void main(String[] args) throws InterruptedException {

            WebDriver driver =  new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
            Thread.sleep(1000);


            By pageTitleLocator = By.xpath("/html/body/app-root/app-login/mat-toolbar/span[1]");
            WebElement portalTitleElement = driver.findElement(pageTitleLocator);
            String title = portalTitleElement.getText();
            System.out.println("Page title: "+title);

            By sectionTitleLocator = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[1]/strong");
            WebElement sectionTitleElement = driver.findElement(sectionTitleLocator);
            String secondTitle = sectionTitleElement.getText();
            System.out.println("Second section Title: "+secondTitle);

            By subTitleLocator = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[2]");
            WebElement subTitleElement = driver.findElement(subTitleLocator);
            String subTitleText = subTitleElement.getText();
            System.out.println("Sub title text: "+ subTitleText);

            By usernameLocator = By.name("username");
            WebElement usernameElement = driver.findElement(usernameLocator);
            usernameElement.sendKeys("WrongUser");

            By passwordLocator = By.name("password");
            WebElement passwordElement = driver.findElement(passwordLocator);
            passwordElement.sendKeys("WrongPassword");

            By loginButtonLocator = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button[1]/span[1]");
            WebElement loginButtonElement = driver.findElement(loginButtonLocator);
            loginButtonElement.click();
            Thread.sleep(1000);

            By userNameNotFoundLocator = By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-content/app-banner/div");
            WebElement userNameNotFoundElement = driver.findElement(userNameNotFoundLocator);
            String userNameNotFoundText = userNameNotFoundElement.getText();
            System.out.println("Login Button Text: "+ userNameNotFoundText);
            Thread.sleep(1000);

            driver.quit();



    }
}
