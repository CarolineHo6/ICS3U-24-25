package arrayLists;

import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();

        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");

        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.remove(i));
        }
        
    }
    
}
