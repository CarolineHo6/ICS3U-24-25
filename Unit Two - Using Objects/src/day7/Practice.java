package day7;

public class Practice {
    public static void main(String[] args) {
        Integer integer = new Integer(7);
        int max = Integer.MAX_VALUE;            // 2^31 - 1
        int min = Integer.MIN_VALUE;            // includes 0
        System.out.println(max + " + " + min);
        int z = integer.intValue();
        System.out.println(z);

        int a = Math.abs(-1);
        double b = Math.pow(3, 2);
        double c = Math.sqrt(3);
        double e = (Math.random()*10)+1;
        System.out.println(a + " "+ b+ " " + " " + c+ " " + e);

        String s = new String("Hello");
        String s2 = "Hello";
        int l = s.length();
        String sub = s.substring(1);
        String sub2 = s.substring(2, 3);
        int index = s.indexOf("el");
        boolean equals = s.equals(s2);
        int compare = s.compareTo(s2);
        System.out.println(l);
        System.out.println(sub);
        System.out.println(sub2);
        System.out.println(index);
        System.out.println(equals);
        System.out.println(compare);
    }
}
