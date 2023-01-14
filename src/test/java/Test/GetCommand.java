package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommand {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        System.out.println("Title of the page: "+driver.getTitle());
        System.out.println("Current url of the page: "+driver.getCurrentUrl());
        String pageSource =driver.getPageSource();
        if(pageSource.contains("String.prototype.startsWith")){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }

        driver.quit();


    }
}
