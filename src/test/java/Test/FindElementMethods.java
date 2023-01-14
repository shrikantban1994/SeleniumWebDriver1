package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement GoogleSearchBtn = driver.findElement(By.name("btnK"));
        if(GoogleSearchBtn.isEnabled()){
            System.out.println("Element is enabled");
        }else{
            System.out.println("Element is not enabled");
        }
        driver.quit();
    }
}
