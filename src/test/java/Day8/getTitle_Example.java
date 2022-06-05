package Day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class getTitle_Example {
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to google calculator
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        //capture the title of your page and compare it ith your expected title GOOGLE
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("GOOGLE")) {
            System.out.println("My title matches");
        } else {
            System.out.println("Title does not match. Actual title is " + actualTitle);
        }

        driver.quit();
    }
}