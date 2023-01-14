package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();

        String MainWindow = driver.getWindowHandle();
        System.out.println(MainWindow);

        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles){
            if(!MainWindow.equals(handle)){
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle).getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(MainWindow);
        driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("Automation Testing");
        driver.findElement(By.xpath("//div[text()='Search']")).click();


    }
}
