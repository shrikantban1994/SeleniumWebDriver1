package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.navigate().to("https://www.gmail.com");
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();
    }
}
