package tek.selenium.week_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException{
        // we can use throws keyword or try catch
//        open chrome browser navigate to facebook page
//        print the title and quite browser

//      ChromeDriver chromeDriver = new ChromeDriver(); // we can use WebDriver interface instead.


//        WebDriver driver = new ChromeDriver();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input browser type");
        String browserType = scanner.next();
        WebDriver driver;
//        String browserType = "chrome";
        if (browserType.equals("chrome")) {
            driver = new ChromeDriver();
        }else if(browserType.equals("firefox")) {
            driver = new FirefoxDriver();
        }else if(browserType.equals("edge")) {
            driver = new EdgeDriver();
        }else{
            throw new RuntimeException("invalid browser type");
            // Intentionally stops the application with throw keyword.

        }
        driver.get("https://www.facebook.com");
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(1000 * 5);
        driver.quit();;


        }
    }
