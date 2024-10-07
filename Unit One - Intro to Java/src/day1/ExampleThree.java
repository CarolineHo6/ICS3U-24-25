package day1;



public class ExampleThree {
    public static void main(String[] args) {
        int x = 5; int y = 2;
        int sum = x + y;

        int diff = x- y;

        System.out.println(sum);
        System.out.println(diff);

        System.out.println(x*y);
        System.out.println(x/y);        // truncates int / int

        System.out.println(5%2);        // % (modulus) gets the remainder

        double average = (81 + 77 + 99) / 3.0;      // if you don't double something it will truncate
        System.out.println(average);
    }
}
