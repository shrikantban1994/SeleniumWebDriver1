package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RegisterAccountPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.id("input-firstname")).sendKeys("sachin");
        driver.findElement(By.id("input-lastname")).sendKeys("Tendulkar");
        driver.findElement(By.id("input-email")).sendKeys("sachintendulkar1@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("8564451232");

        driver.findElement(By.name("password")).sendKeys("Sachin1@");
        driver.findElement(By.name("confirm")).sendKeys("Sachin1@");

        driver.findElement(By.linkText("login page")).click();
        try {
            Thread.sleep(5000);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        driver.navigate().back();
        if(driver.findElement(By.partialLinkText("Login")).isDisplayed()){
            System.out.println("Login link is displayed");
        }else{
            System.out.println("Login link is not displayed");
        }
        List<WebElement> buttons = driver.findElements(By.tagName("a"));
        for(WebElement button : buttons){
            if(!button.getText().isEmpty()) {
                System.out.println(button.getText());
            }
        }
        driver.quit();
    }

}
