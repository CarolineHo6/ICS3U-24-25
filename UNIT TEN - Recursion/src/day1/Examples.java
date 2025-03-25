package day1;

public class Examples {

    static long[] solutions;

    public static void main(String[] args) {
        int n = 150;
        solutions = new long[n + 1];
        System.out.println(recursiveFibonacci(n));
        System.out.println(iterativeFactorial(7));
        System.out.println(recursiveFactorial(7));
    }

    private static long recursiveFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (solutions[n] != 0) {
            return solutions[n];
        }
        solutions[n] = recursiveFactorial(n - 1) + recursiveFibonacci(n - 2);
        return solutions[n];
    }

    private static int recursiveFactorial(int n) {
        while (n == 0) {
            return 1;
        }
        return n * (recursiveFactorial(n - 1));
    }

    private static int iterativeFactorial(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        return result;
    }
}