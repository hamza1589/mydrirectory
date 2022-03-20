import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertPopUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//hamza//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        Alert alert=driver.switchTo().alert();
       System.out.println(alert.getText());
       alert.accept();
    }
}
