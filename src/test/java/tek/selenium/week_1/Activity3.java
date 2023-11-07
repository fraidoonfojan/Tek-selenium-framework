package tek.selenium.week_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Activity3 {
    /*
   navigate to https://bbc.com
   and print the text of all links this home page.
    */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://bbc.com");
        Thread.sleep(3000);

        By anchorTagLocator = By.tagName("a");
        List<WebElement> linksElements =driver.findElements(anchorTagLocator);
// for enhanced loop:
        for(WebElement elements : linksElements){
        String tagText = elements.getText();
// for loop:
//        for(int i =0; i<linksElements.size(); i++){
//            String linkText = linksElements.get(i).getText();
//
//            System.out.println(linkText);
        }
        driver.quit();
}}
