import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//hamza//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.freecrm.com/");
        scrollIntoView(driver.findElement(By.xpath("//h3[text()='Deal Pipeline']")),driver);

    }
    public static void scrollIntoView(WebElement element,WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("argument[0].scrollIntoView(true);",element);
    }

}
