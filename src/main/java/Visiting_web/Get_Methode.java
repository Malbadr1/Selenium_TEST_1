package Visiting_web;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methode {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://qacart.com/course/selenium-webdriver?clientSideRedirect=1");
    }
}
