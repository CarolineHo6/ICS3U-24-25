import java.util.*;

public class RollerCoasterRide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        if (c*p >= n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
