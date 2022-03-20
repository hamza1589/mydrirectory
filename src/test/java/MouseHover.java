import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHover {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//hamza//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
        driver.findElement(By.xpath("//div[text()='Covid-19 RT-PCR Test']")).click();

    }
}
