package Visiting_web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver= new ChromeDriver() ;
        webDriver.get("https://www.facebook.com/");
        String url= webDriver.getCurrentUrl();
        System.out.println("the currentUrl is :"+ url);
    }
}
