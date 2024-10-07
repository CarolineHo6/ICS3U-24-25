package day3;

public class ExampleTwo {
    public static void main(String[] args) {
        double x = 7;   // widening conversion int --> double
                        // implicit cast
        
        double a = (double) 4 / 3;  // explicit casting and widening conversion
        System.out.println(a);

        a = (double) (4/3);         // brakets first then casting, 4/3 = 1 then 1.0
        System.out.println(a);      // explicit casting

        // int z = 8.9;    // Java does not preform implicit narrowing conversion

        int z = (int)8.9;   // We can preform an explicit narrowing conversion

        // double n = (boolean)false;      // Cannot cast from boolean to double
    }
}
