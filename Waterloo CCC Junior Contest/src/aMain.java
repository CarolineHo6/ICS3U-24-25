import java.util.*;

public class aMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        String[] d = new String[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String l = sc.nextLine();
            d[i] = l;
            if (d[i] == "P" && d[i+1] == "P") {
                count = 0;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
