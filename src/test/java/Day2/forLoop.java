package Day2;

import java.util.ArrayList;

public class forLoop {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Bronx");
        cities.add("Long Island");
        cities.add("Staten Island");

        for (int i = 0; i < cities.size(); i++){
            System.out.println("My city is " + cities.get(i));
        }
    }
}
