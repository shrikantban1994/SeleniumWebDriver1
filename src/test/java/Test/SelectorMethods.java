package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("shrikantban08@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("Shrikant1@");
        driver.findElement(By.cssSelector("input[value='Login']")).click();


    }
}
