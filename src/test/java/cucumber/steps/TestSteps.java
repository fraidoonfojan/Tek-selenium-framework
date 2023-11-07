package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSteps {
    private static WebDriver driver;

    @Given("open browser {string}")
    public void openBrowser(String browser) {
        driver.manage().window().maximize();
        driver.get("https://qa.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @When("sending username {string} and password {string}")
    public void credentials(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
    }

     @And("click on login button")
     public void login() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginButton"))).click();
    }

    @Then("login success")
    public void loginSuccess() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        String titleText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-menu-items/mat-nav-list/a[1]"))).getText();
        System.out.println(titleText);
    }
    @And("close browser")
    public void closeBrowser(){
        driver.quit();




    }

}
