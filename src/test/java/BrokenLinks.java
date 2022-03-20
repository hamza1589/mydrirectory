import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//hamza//Downloads//Selenium-standalone//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/broken");
        // Get the list of all links and image
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());

        //checking the links fetched.
        for (int i = 0; i < linkList.size(); i++) {
            WebElement E1 = linkList.get(i);
            String url = E1.getAttribute("href");
            verifyLinks(url);
        }

        driver.quit();
    }


    public static void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);

            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() >= 400) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
            }

            //Fetching and Printing the response code obtained
            else {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
        } catch (Exception e) {
        }

    }
}

