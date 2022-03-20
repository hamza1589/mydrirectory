import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//hamza//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("//body//a//img[@src='Jmeter720.png']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("philadelphia-field-email")).sendKeys("hamza");
    }
}
