package day4;

public class WrapperExample {
    public static void main(String[] args) {
        Integer int1 = new Integer(7);      // assigning an Integer Ovject (7) to int1
        Integer int2 = 8;                         // assigns a primative int (8) but Java
                                                  // creates an Integer Object for you.
                                                  // this is auto-boxing
        int y = int1;                             // auto unboxing

        int z = int2.intValue();                  // does the same as the line above with more work

        System.out.println(Integer.MAX_VALUE);    // Includes 0 as a positive so answer is 2^31-1
        System.out.println(Integer.MIN_VALUE);    // answer is 2^31
    
        double d1 = 10.0;
        Double d2 = 20.0;
        Double d3 = new Double(30.0);
        Double d4 = new Double(40.0);

        System.out.println(d1+d2+d3.doubleValue()+d4);
        System.out.println(d2.doubleValue());
    }
}
