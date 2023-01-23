package Visiting_web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://qacart.com/");
        webDriver.manage().window().maximize();
        String title = webDriver.getTitle();
        System.out.println("This is A Title:"+title);
    }
}
