package Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements_Example {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chromeoptions arguement
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //setting your driver as headless
        //options.addArguments("headless");
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);
        //maximize the driver
        // driver.manage().window().maximize();

        //navigate to bing home
        driver.navigate().to("https://www.bing.com");
        Thread.sleep(1500);
        //click on images using class property with index of 1
        //to ignore white space in the property value we can use contains command in xpath
        driver.findElements(By.xpath("//li[contains(@class,'scope')]")).get(0).click();

    } //end main
}
