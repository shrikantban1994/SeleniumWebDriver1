package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCommands {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("user-name")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("item_4_title_link")).click();

        Thread.sleep(5000);
        driver.quit();

    }
}
