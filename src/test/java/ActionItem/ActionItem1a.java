package ActionItem;
import java.util.ArrayList;
public class ActionItem1a {
    public static void main(String[] args) {
        // create an Arraylist for countries
        ArrayList<String> country = new ArrayList<>();
        ArrayList<Integer> countryCode = new ArrayList<>();
        country.add("usa"); // value number 0
        country.add("india" ); // value number 1
        country.add("srilanka"); // value number 2
        country.add("bangladesh"); // value number 3
        countryCode.add(1);
        countryCode.add(2);
        countryCode.add(3);
        countryCode.add(4);


        for (int i = 0; i < countryCode.size(); i++){
            System.out.println("My city is " + country.get(i) + " my countryCode is " + countryCode.get(i) );
        }
    }

    }// end of main method
// end of java
