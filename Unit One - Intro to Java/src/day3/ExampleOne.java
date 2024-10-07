package day3;

/**
 * ExampleThree
 */
public class ExampleOne {
    public static void main(String[] args) {
        int mark1 = 70, mark2 = 96, mark3 = 88;
        double average;
        int numMarks = 3;

        // average = (mark1 + mark2 + mark3) / numMarks;   // widening conversion - Java increased the precision
        // System.out.println(average);                    // when java does something for you it is an implicit cast

        //average = (mark1 + mark2 + mark3) / (double)numMarks;   // widenin conversion - we increased the precision
        //System.out.println(average);                            // explicit cast
        // numMarks is treated as a double

        //average = (mark1 + mark2 + (double)mark3) / numMarks;
        //System.out.println(average);

        average = (double)(mark1 + mark2 + mark3) / numMarks;
        System.out.println(average);       // 84.66666666666666666666667

    }
}
