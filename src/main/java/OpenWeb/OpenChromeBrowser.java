package OpenWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class OpenChromeBrowser {
    public static void main(String[] args) {
       WebDriverManager.safaridriver().setup();
       WebDriver webDriver= new SafariDriver();



    }
}
