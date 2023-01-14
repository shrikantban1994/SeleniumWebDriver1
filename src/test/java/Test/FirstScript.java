package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String Actualtitle=driver.getTitle();
        String ExpTitle="Google";
        if(ExpTitle.equals(Actualtitle))
        {
            System.out.println("Title is verified");
        } else{
            System.out.println("Title is not verified");
        }
        driver.get("https://gmail.com");
        driver.quit();

    }
}
