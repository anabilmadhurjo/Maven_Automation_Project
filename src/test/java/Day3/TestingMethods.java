package Day3;
import ReusableLibraries.ReusableMethods;
public class TestingMethods {

    public static void main(String[] args) {
        //call the add two number method and execute it
        ReusableMethods.addTwoNumbers(20,30);

                //call the return method and store it in a variable to perform something else
        int finalResult = ReusableMethods.subtractTwoNumbers(50,10);
        int newResult = finalResult + 10;
        System.out.println("New result is " + newResult);

    }
}
