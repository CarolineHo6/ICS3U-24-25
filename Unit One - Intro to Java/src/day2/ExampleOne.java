package day2;

public class ExampleOne {
    public static void main(String[] args) {
        final int number = 1234;
        
        // get the sum of the individual digits in the number
        // use / and %


        int digit1 = number / 1000;         // 1234 / 1000 = 1 (I have 1 thousands)
        int digit2 = (number / 100) % 10;   // (1234 / 100) = 12 % 10 = 2
        int digit3 = (number / 10) % 10;    // (1234 / 10) = 123 % 10 = 3
        int digit4 = number % 10;           // 1234 % 10 = 4

        int total = digit1 + digit2 + digit3 + digit4;

        System.out.println(total);
        System.out.println(digit1 + digit2 + digit3 + digit4);
    }
}
