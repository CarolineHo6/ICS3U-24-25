package arrayLists;

import java.util.ArrayList;


public class Example {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Henry");
        names.add("Nolan");
        names.add("Steve");

        for (String n : names) {
            System.out.println(n);
        }

        System.out.println();

        names.add(0, "Eric");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.set(2, "Cindy");

        System.out.println();
        for (String n : names) {
            System.out.println(n);
        }


    }
}
