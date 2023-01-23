package Visiting_web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxMinFll {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("C:\\Users\\mohan\\IdeaProjects\\Selenium_TEST_1\\src\\test\\resources\\index.html");
       // webDriver.manage().window().maximize();
       // webDriver.manage().window().minimize();
       // webDriver.manage().window().fullscreen();
      //  Dimension iphoneSE =new Dimension(412,915);
      //  webDriver.manage().window().setSize(iphoneSE);

    }
}
