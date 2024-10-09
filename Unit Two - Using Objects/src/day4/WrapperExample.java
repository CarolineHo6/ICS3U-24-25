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
                                                  // one of the boxes is used for +/-
    
        long num = 7;
    }
}
