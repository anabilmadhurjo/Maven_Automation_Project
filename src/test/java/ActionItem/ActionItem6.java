package ActionItem;

import ReusableLibraries.Reusable_Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ActionItem6 {

    //declare the local driver outside so that it can be reusable with other annotation methods
    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;
    //before suite will set the driver you are using
    @BeforeSuite
    public void SetChromeDriver(){
        driver = Reusable_Actions.setDriver();
        //define the path to the report
        reports = new ExtentReports("src/main/java/HTML_Report/Automation.html",true);
    }
    //end of before suite annotation
/*
    @Test (priority = 1)
            //navigate to Applebank
            driver.navigate().to("https://www.applebank.com");
            Thread.sleep(1500);

    String title = driver.getTitle();
            if (title == "Apple Bank") {
        System.out.println("The title matches");
    } else {
        System.out.println("The title does not match. The actual title is " + title);
    } //End of title verification



    @Test (priority = 2)
    /*As a customer, I want to know about checking accounts, so that I can choose the best
    option.
    Acceptance Criteria:
            ● Users should be able to see a link for “Personal” on the navigation bar.
            ● There should be a link to Checkings on the Dropdown
            ● The Checkings link should forward the customer to a different page.
            ● There should be information visible about the different types of options available.*/
/*
    public void CheckingAccount;
    logger = reports.startTest("Search for a keyword");
    driver.navigate().to("https://www.applebank.com");
    Reusable_Actions_Loggers.mouseHover(driver,"//*[@aria-label='Personal']" , "Personal Tab");
    Reusable_Actions_Loggers.clickAction(driver, "//*[@href='/personal/banking/checking]", "Checkings Tab")

    //end the logger per test
        reports.endTest(logger);
//end of test 2  */




    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite



}
