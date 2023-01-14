package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.name("firstname")).sendKeys("Shrikant1");
        driver.findElement(By.name("lastname")).sendKeys("Ban1");
        driver.findElement(By.name("email")).sendKeys("shrikantban09@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("8605067024");
        driver.findElement(By.name("password")).sendKeys("Shrikant1@");
        driver.findElement(By.name("confirm")).sendKeys("Shrikant1@");
        driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();


        try {
            String Title = driver.findElement(By.xpath("//p[text()='Congratulations! " +
                    "Your new account has been successfully created!']")).getText();

            if (Title.equals("Congratulations! Your new account has been successfully created!")) {
                System.out.println("Successfully Registered");
            } else {
                System.out.println("Test case failed");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        driver.quit();

    }
}
