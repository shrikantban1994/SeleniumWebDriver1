package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement element =  driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select se = new Select(element);
        se.selectByValue("za");
        se.selectByVisibleText("Name (A to Z)");
        se.selectByIndex(2);
        boolean MultipleCheck = se.isMultiple();
        System.out.println(MultipleCheck);

    }
}
