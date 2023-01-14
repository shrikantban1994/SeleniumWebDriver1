package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        driver.switchTo().alert().accept();

        String AlertSMS = driver.findElement(By.id("result")).getText();

        if(AlertSMS.equals("You successfully clicked an alert")){
            System.out.println("Test is passed");
        }else{
            System.out.println("test is failed");
        }

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().accept();
        String AlertSMS1 = driver.findElement(By.id("result")).getText();
        if(AlertSMS1.equals("You clicked: Ok")){
            System.out.println("Clicked on OK button");
        }else{
            System.out.println("Clicked on cancel button");
        }
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("Automation testing");
        driver.switchTo().alert().accept();
        String AlertSMS2 = driver.findElement(By.id("result")).getText();
        if(AlertSMS2.equals("You entered: Automation testing")){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");
        }
        driver.quit();
    }
}
