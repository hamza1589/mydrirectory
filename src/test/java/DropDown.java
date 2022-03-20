import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//hamza//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/r.php");
        Select select=new Select(driver.findElement(By.cssSelector("#month")));
        select.selectByValue("10");
        Select select2=new Select(driver.findElement(By.cssSelector("#day")));
        select2.selectByValue("10");
        Select select3=new Select(driver.findElement(By.cssSelector("#year")));
        select3.selectByValue("1995");
        driver.findElement(By.xpath("//input[@value='2']")).click();


    }
}
