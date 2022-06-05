package ActionItem;

import ReusableLibraries.Reusable_Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ActionItem5 {
    public static void main(String[] args) throws InterruptedException {
        //setting the local driver to reusable setDriver method
        WebDriver driver = Reusable_Actions.setDriver();

        //Set Array List for first names
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Lionel");
        firstName.add("Cristiano");
        firstName.add("Neymar");
        //set arraylist for last names
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Messi");
        lastName.add("Ronaldo");
        lastName.add("Junior");
        //set Array List for birth month
        ArrayList<String> DobMonth = new ArrayList<>();
        DobMonth.add("June");
        DobMonth.add("February");
        DobMonth.add("March");
        //Set Array List for birth day
        ArrayList<String> DobDay = new ArrayList<>();
        DobDay.add("25");
        DobDay.add("05");
        DobDay.add("06");
        //set array list for birth year
        ArrayList<String> DobYear = new ArrayList<>();
        DobYear.add("1987");
        DobYear.add("1985");
        DobYear.add("1991");
        //set Array List for zip
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11432");
        zipcode.add("10006");
        zipcode.add("10016");
        //set array list for memberID
        ArrayList<String> memberId = new ArrayList<>();
        memberId.add("123");
        memberId.add("456");
        memberId.add("789");


        //start for loop
        for (int i = 0; i < firstName.size(); i++) {

            //navigate to usps
            driver.navigate().to("https://www.uhc.com");
            Thread.sleep(1500);

            String title = driver.getTitle();
            if (title == "Health insurance plans") {
                System.out.println("The title matches");
            } else {
                System.out.println("The title does not match. The actual title is " + title);
            } //End of title verification

//Click on Find a doctor
            Reusable_Actions.clickAction(driver, "//*[@aria-label='Find a doctor']", "Find a doctor");
            Thread.sleep(1500);
//Click on Sign in To find a provider
            Reusable_Actions.clickAction(driver, "//*[@aria-label='Sign in menu']", "Sign In");
            Thread.sleep(1500);
//Click on Medicare plan
            Reusable_Actions.clickAction(driver, "//*[@aria-label= 'Medicare plan? Sign in to Medicare member site Opens a new window']", "Medicare plan?");
            Thread.sleep(1500);
//switch tabs
           // Reusable_Actions.switchToTabByIndex(driver, 1);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            //click on register now
            Reusable_Actions.clickAction(driver, "//*[@class= 'uhc-tempo-link uhc-tempo-link--medium registerBtn ng-scope']", "Register now");

//Fill in the registration tab
            Reusable_Actions.sendKeysAction(driver, "//*[@id='firstName']", firstName.get(i), "First Name");
            Thread.sleep(1500);
            Reusable_Actions.sendKeysAction(driver, "//*[@id='lastName']", lastName.get(i), "Last Name");
            Thread.sleep(1500);
            Reusable_Actions.selectByText(driver, "//*[@name='dob_month']", DobMonth.get(i), "Enter First Name");
            Thread.sleep(1500);
            Reusable_Actions.sendKeysAction(driver, "//*[@id='dob_day']", DobDay.get(i), "Enter birth day");
            Thread.sleep(1500);
            Reusable_Actions.sendKeysAction(driver, "//*[@id='dob_year']", DobYear.get(i), "Enter birth year");
            Thread.sleep(1500);
            //scroll
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0, 800) ");
            //click on zipcode
            Reusable_Actions.clickAction(driver, "//*[@class='Tier2Component_Tier2Input__1P5aB undefined']", "Click on zipcode");
            Thread.sleep(1500);
            Reusable_Actions.sendKeysAction(driver, "//*[@id='zipCode']", zipcode.get(i), "Enter zip code");
            Thread.sleep(1500);
            Reusable_Actions.sendKeysAction(driver, "//*[@id='memberId']", memberId.get(i), "Enter ID");
            Thread.sleep(1500);

            Reusable_Actions.clickAction(driver, "//*[@id='submitBtn']", "Click on continue");
            //capture error text
            String error = Reusable_Actions.getTextAction(driver, "//*[@id='plainText_error']", "Get error msg");
            System.out.println(error);

        }// end of for loop

        driver.quit();

    } //end of main method
} //end of class

