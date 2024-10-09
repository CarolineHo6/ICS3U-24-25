package day5;

public class StringExamples {
    public static void main(String[] args) {
        // System.out.println("This is a String");
        int x = 7;
        int y = 8;

        // System.out.println("Answer is " + x + y);   // Answer is 78
        // String concat.
        // Anything + a String is a String
        // System.out.println("Answer is " + (x + y)); // Answer is 15

        // String s1 = "Apple";
        // String s2 = "Mango";
        // String s3 = "Apple";
        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);

        // does not place "Happy" in a shared tale so it creates 3 "Happy" strings
        // String str1 = new String("Happy");  // creates new string each time
        // String str2 = new String("Happy");  // creates new string each time
        // String str3 = new String(str1);     // creates new string each time

        // System.out.println(str1 == str2);   // false
        // System.out.println(str1 == str3);   // false
        // System.out.println(str2 == str1);   // false

        String message = "AP  COMP  SCI  ROCKS";
        System.out.println(message.length());
        int largestIndex = message.length() - 1;

        int rocks = message.indexOf("ROCKS");
        System.out.println(rocks);

        int sci = message.indexOf("Sci");
        System.out.println(sci);            // returns -1 cause it is not an index

        System.out.println(message.indexOf(" "));

        System.out.println(message.substring(1, 4));    // "P  "

        // 5 characters starting at index 10
        String s = message;
        System.out.println(s.substring(10, 15));        // "SCI  "

        System.out.println(s.substring(11));


    }
}
