import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.*;

public class Findjobs {
    
    
    int num;
    public void Find(String text,WebDriver driver) {
        num = driver.findElements(By.linkText(text)).size();
        System.out.println("Стив Джобс упоминается: " + num);
        File file = new File("E://Apple.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.print("Steve Jobs mention " + num + "time");
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
