package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assigment1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        WebDriver driver =new FirefoxDriver();

        driver.get("https://gmail.com");
        driver.manage().window().maximize();

        String ActTitle = driver.getTitle();
        String ExpTitle ="Gmail";
        if((ActTitle.equals(ExpTitle))){
            System.out.println("Title is Verified");
        } else{
            System.out.println("Title is not verified");
        }
        driver.quit();
    }
}
