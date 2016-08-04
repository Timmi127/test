import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by User on 15.07.2016.
 */
public class openApple {


    private WebElement q;

    public void click(String text,WebDriver element) {

        q = element.findElement(By.linkText(text));
        q.click();
    }
}
