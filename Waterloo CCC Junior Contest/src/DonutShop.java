import java.util.*;

public class DonutShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();   // donuts at start of day
        int e = sc.nextInt();   // events

        for (int i = 0; i < e; i++) {
            sc.nextLine();
            String q = sc.nextLine();
            int n = sc.nextInt();
            if (q.equals("+")) {
                d += n;
            } else {
                d -= n;
            }
        }
        System.out.println(d);
    }
}
