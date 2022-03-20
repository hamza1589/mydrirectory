import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StaleElementException {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//hamza//Downloads//Selenium-standalone//chromedriver.exe");
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

    }
}
