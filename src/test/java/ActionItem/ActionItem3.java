package ActionItem;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem3 {
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chromeoptions arguement
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");

        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);
        //maximize the driver
        //driver.manage().window().maximize();

        //capture search number and print for following cities using arraylist and forloop
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("Gaming");
        hobbies.add("Music");
        hobbies.add("Dancing");
        hobbies.add("Photography");
        hobbies.add("Sports");
        for (int i = 0; i < hobbies.size(); i++) {

            //go to Bing homepage
            driver.navigate().to("https://www.bing.com");
            Thread.sleep(1000);
            //locate element for search field and type keyword "hobbies"
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobbies.get(i));
            //submit on Bing search button
            driver.findElement(By.xpath("//*[@name='search']")).submit();
            Thread.sleep(1000);
            //capture the Bing search and print it
            String searchResult = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            System.out.println("Result is " + searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");

            System.out.println("My search number for the hobby " + hobbies.get(i) + " is " + arrayResult[0]);

        } //end of for loop
        driver.quit();

    }

}
