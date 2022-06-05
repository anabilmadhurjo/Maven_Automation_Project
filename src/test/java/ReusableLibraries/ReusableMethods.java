package ReusableLibraries;

public class ReusableMethods {
     public static void addTwoNumbers(int num1, int num2) {
         int result = num1 + num2;
         System.out.println("The result of two numbers is " + (num1 + num2));

     }
     //create a return integer method to subtract two numbers
     public static int subtractTwoNumbers(int a, int b){
         int result = a-b;
         System.out.println("The result of two numbers for subtraction is " + result);

         return result;

     }
}

