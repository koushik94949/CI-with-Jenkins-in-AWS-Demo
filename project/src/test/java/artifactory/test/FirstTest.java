package artifactory.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FirstTest {
 
    //-----------------------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;
 
    //Declare a test URL variable
    public String testURL = "http://35.200.147.21:31000/project-1.0-RAMA/";
 
    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest (){
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        //Create a new ChromeDriver
         driver = new ChromeDriver();
         //Go to http://35.200.147.21:31000/project-1.0-RAMA/
        driver.navigate().to(testURL);
    }
 
    //-----------------------------------Tests-----------------------------------
    @Test
    public void firstTest () {
        //Get page title
        String title = driver.getTitle();
 
        //Print page's title
        System.out.println("Page Title: " + title);
 
        //Assertion
        Assert.assertEquals(title, "Welcome to Continous Integration with Jenkins in AWS Yottabyte session", "Title assertion is failed!");
    }
 
    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest (){
        //Close browser and end the session
        driver.quit();
    }
}
