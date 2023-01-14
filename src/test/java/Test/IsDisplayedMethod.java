package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IsDisplayedMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.MILLISECONDS);

        if(driver.findElement(By.name("newsletter")).isDisplayed()){
            if(!driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()){
                driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
            }else{
                driver.findElement(By.xpath("(//input[@name='newsletter'])[2]")).click();
            }
        }
        if(driver.findElement(By.name("agree")).isEnabled()){
            driver.findElement(By.name("agree")).click();
            driver.quit();
        }else{
            System.out.println("Your in else block");
            driver.manage().timeouts().implicitlyWait(05, TimeUnit.MILLISECONDS);
            driver.findElement(By.name("agree")).click();
        }
    }
}
