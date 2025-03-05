package arrayLists;

import java.util.ArrayList;

public class ListExamples {
    public static void main(String[] args) {
        ArrayList<String> n = new ArrayList<String>();
        n.add("Steve");
        n.add("Henry");
        n.add("Nolan");

        for (String name : n) {
            System.out.println(name);
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(7);
        numbers.add(12);

        for (Integer num : numbers) {
            System.out.println(num);
        }

        ArrayList stuff = new ArrayList();

        stuff.add(7);
        stuff.add("Happy");
        stuff.add(new Frog());

        ((Frog)stuff.get(1)).jump();    // ClassCastException wont work cause cant turn String into a Frog


    }
}
