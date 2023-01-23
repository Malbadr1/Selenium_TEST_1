package Visiting_web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");
        webDriver.navigate().to("https://qacart.com/");
        webDriver.navigate().back();
        webDriver.navigate().refresh();
        webDriver.navigate().forward();
        webDriver.quit();
    }
}
