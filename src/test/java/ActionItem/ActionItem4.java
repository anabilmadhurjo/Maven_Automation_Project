package ActionItem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class ActionItem4 {
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
        // options.addArguments("headless");
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11432");
        zipCode.add("10006");
        zipCode.add("10013");


        // start of for loop
        for (int i = 0; i < zipCode.size(); i++) {
            try {
                driver.navigate().to("https://www.weightwatchers.com");
            } catch (Exception err) {
                System.out.println("Unable to navigate to website " + err);
            }

            Thread.sleep(1500);

            //click on Attend
            try {
                driver.findElement(By.xpath("//*[@class='MenuItem_menu-item__angle-wrapper__upMgD']")).click();
            } catch (Exception err) {
                System.out.println("Unable to click on Attend " + err);
            }

            Thread.sleep(1500);

            //click on Unlimited Workshops on the dropdown
            try {
                driver.findElement(By.xpath("//*[@class='MenuItem_subtitle__1y5kh']")).click();
            } catch (Exception err) {
                System.out.println("Unable to click on Unlimited Workshops " + err);
            }


            Thread.sleep(1500);

            //click on Studio
            try {
                driver.findElement(By.xpath("//*[@class='buttonWrapper-QK2gi']")).click();
            } catch (Exception err) {
                System.out.println("Unable to click on Studio " + err);
            }

            //click on Search

            try {
                driver.findElement(By.xpath("//*[@class='input input-3TfT5']")).click();
            } catch (Exception err) {
                System.out.println("Unable to click on Search " + err);
            }


            //Enter Zipcodes
            try {
                driver.findElement(By.xpath("//*[@placeholder='Enter location']")).sendKeys(zipCode.get(i));
            } catch (Exception err) {
                System.out.println("Unable to enter zipcode " + err);
            }
            //Click on Right Arrow Search
            try {
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            } catch (Exception err) {
                System.out.println("Unable to click right arrow " + err);
                Thread.sleep(1500);

                //Click on studio link
                driver.findElement(By.xpath("//*[@class='linkUnderline-1_h4g']")).click();

//Get address and information of the studio
                String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println(address);


//get schedule
                String meetingTime = driver.findElement(By.xpath("//*[@class='meetingTime-1g52A']")).getText();
                System.out.println("The Meeting Time at the location is " + meetingTime);


            }//end of loop
            driver.quit();
        } // end of method

    }//end of class
} //end of main



