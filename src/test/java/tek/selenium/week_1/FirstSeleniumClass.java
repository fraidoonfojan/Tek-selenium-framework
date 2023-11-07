package tek.selenium.week_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        //1) create new object of chromeDriver

        ChromeDriver driver = new ChromeDriver();

        driver.get("https:hotmail.com");
        driver.manage().window().maximize();
    }
}
