import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.*;


public class test {


    public static void main(String[] args) {
        
        WebDriver driver=new FirefoxDriver();
            driver.get("http://en.wikipedia.org");
            
            GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);
            page.searchFor("apple jobs!",driver);
            
            openApple pagetwo =PageFactory.initElements(driver,openApple.class);
            pagetwo.click("Apple Inc.",driver);
            
            Findjobs pagethree =PageFactory.initElements(driver,Findjobs.class);
            pagethree.Find("Steve Jobs",driver);
    }
    }

