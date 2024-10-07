package day1;

//int and double are primative data types

public class ExampleTwo {
    public static void main(String[] args) {
        String str = "This is a String";       //String tyype
        System.out.println(str);

        int numStudents = 14;   // variables use camelCase naming convention
        System.out.println(numStudents);

        double temperature = 21.7;  // double is for floating point decimals
        System.out.println(temperature);

        double x = 9;   // will put out 9.0
        System.out.println(x);

        boolean hasShoes = true;
        System.out.println(hasShoes);

        int a = 8, b = 9, c;    // declare a variable before you use it
        System.out.println(a+b);
        // System.out.println(c);   c is not initialised it is an error.

        a = 10;

        final double PI = 3.14;     // final means it is a constant
        // PI = 8.1; cannot change PI

        final int NUM_SUITS = 4;
    }
}
