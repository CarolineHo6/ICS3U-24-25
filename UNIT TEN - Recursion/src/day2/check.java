package day2;

public class check {
    public static void main(String[] args) {
        mystery(123456);
    }

    private static void mystery(int n) {
        if ((n/10) != 0) {
            mystery(n/10);
        }

        System.out.print(n%10);
    }

    private static void mystery1(int n) {
        
    }
}

