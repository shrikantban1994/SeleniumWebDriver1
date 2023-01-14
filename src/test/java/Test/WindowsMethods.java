package Test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        //Maximize the screen
//        driver.manage().window().maximize();

        // Fullscreen the current window
//        driver.manage().window().fullscreen();

        //Get the current position of screen
//        Point point = driver.manage().window().getPosition();
//        System.out.println(point.x);
//        System.out.println(point.y);

        //Set the Position of the screen
//        Point point1 = new Point(300,600);
//        driver.manage().window().setPosition(point1);

        //Set the size of the screen
        Dimension dimension = new Dimension(300,500);
        driver.manage().window().setSize(dimension);
//
        driver.quit();
    }
}
