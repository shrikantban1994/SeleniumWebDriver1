package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment2 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.name("firstname")).sendKeys("shrikant");
        driver.findElement(By.name("lastname")).sendKeys("Ban");
        driver.findElement(By.name("email")).sendKeys("shrikant15@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("8605064325");
        driver.findElement(By.name("password")).sendKeys("Shri3@");
        driver.findElement(By.name("confirm")).sendKeys("Shri3@");
//        driver.findElement(By.name("newsletter")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        String ExpMessege =driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
        if(ExpMessege.equals("Your Account Has Been Created!")){
            System.out.println("Test is passed");
            driver.close();
        } else{
            System.out.println("Test is failed");
        }






    }
}
