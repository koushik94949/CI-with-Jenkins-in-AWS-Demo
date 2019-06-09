package project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.jetty.html.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\Program Files(x86)\Google\Chrome\Application\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.200.147.21:31000/project-1.0-RAMA/");
        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     
    }
    
  }
