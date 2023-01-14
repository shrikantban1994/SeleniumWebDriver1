package Test;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        Set< Cookie > Cookies = driver.manage().getCookies();
        System.out.println(Cookies);

        Cookie curr = driver.manage().getCookieNamed("currency");
        System.out.println(curr);

        Cookie customCookie = new Cookie("user", "tester");
        System.out.println(customCookie);

        System.out.println(driver.manage().getCookieNamed("user"));

        driver.manage().deleteCookie(customCookie);

        driver.manage().deleteCookieNamed("currency");

        Set<Cookie> Cookies1 = driver.manage().getCookies();
        System.out.println(Cookies1);

        driver.quit();
    }
}
