import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleWindowPopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//hamza//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> handler=driver.getWindowHandles();
        Iterator<String>it=handler.iterator();
        String parentWindow=it.next();
        System.out.println(parentWindow);
        String childWindow=it.next();
        driver.switchTo().window(childWindow);
       System.out.println( driver.getTitle());
       driver.close();
       driver.switchTo().window(parentWindow);
       System.out.println(driver.getTitle());



    }
}
