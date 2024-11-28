package day3;

public class WhileLoopExamples {
    public static void main(String[] args) {

        int start = 1;
        int end = 1000;

        // int sum = forLoopSum(start, end);
        //int sum = whileLoopSum(start, end);
        //System.out.println(sum);

        int counter = 0;
        for (int x = 10; x > 0; x--){
            for (int y = x; y <= x; y++){
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static int forLoopSum(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    private static int whileLoopSum(int start, int end) {
        int sum = 0;

        while (start <= end) {
            sum += start;
            start++;
        }
        return sum;
    }
}
