import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearchPage {


    private WebElement q;
    
    public void searchFor(String text,WebDriver element) {
        
        q=element.findElement(By.name("search"));
        q.sendKeys(text);
        q.submit();
    }
}
