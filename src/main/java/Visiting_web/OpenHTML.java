package Visiting_web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHTML {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver= new ChromeDriver();
        webDriver.get("C:\\Users\\mohan\\IdeaProjects\\Selenium_TEST_1\\src\\test\\resources\\index.html" +"");
    }
}
