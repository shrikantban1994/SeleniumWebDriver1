package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OptionsMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select se = new Select(element);
        List<WebElement> options = se.getOptions();
        for(WebElement e : options){
            System.out.print(e.getText()+" ");
        }
        System.out.println();
        se.selectByValue("USA");
        se.selectByValue("Russia");
        se.selectByValue("Japan");
        se.selectByValue("Mexico");
        se.selectByValue("India");
        se.selectByValue("Germany");
        WebElement FirstSelectedOption = se.getFirstSelectedOption();
        System.out.print("First Selected options: "+FirstSelectedOption);

        List<WebElement> AllSelectedOptions = se.getAllSelectedOptions();
        System.out.println();
        for(WebElement e : AllSelectedOptions)
        {
            System.out.print(e.getText()+" ");
        }

    }
}
