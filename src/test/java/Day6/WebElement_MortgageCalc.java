package Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElement_MortgageCalc {
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


        //navigate to mortgagecalculator site
            driver.navigate().to("https://www.mortgagecalculator.org");
            Thread.sleep(1000);
            //cLick, clear and enter new value on Home value field
            WebElement homeValue = driver.findElement(By.xpath("//* [@id= 'homeval']"));
            homeValue.click();
            homeValue.clear();
            Thread.sleep(1500);
            homeValue.sendKeys("450000");
            Thread.sleep(1500);
            //click on % radio button
            driver.findElement(By.xpath("//*[@value='percent']")).click();
            //click, clear and enter new value on down payment field
            WebElement downPayment = driver.findElement (By.xpath("//*[@id='downpayment']"));
            downPayment.click();
            downPayment.clear();
            Thread.sleep(1500);
            downPayment.sendKeys("5");


    }
}
