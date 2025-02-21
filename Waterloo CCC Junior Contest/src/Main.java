import java.util.*;

// 0 == 48

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] f = new String[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            String str = "";
            sc.nextLine();
            String a = sc.nextLine();
            for (int j = 0; j < a.length(); j++) {
                String num = "";
                int k = j;
                int q = (int) a.charAt(j);
                if (q >= 65 && q <= 90) {
                    str += a.charAt(j);
                } else if (((int) a.charAt(j) == 45)) {
                     num += "-";
                } else if (q >= 48 && q <= 58) {
                    num += a.charAt(j);
                    if (j < a.length()-1 && (int) a.charAt(k + 1) >= 48 && (int) a.charAt(k + 1) <= 58) {
                        num += a.charAt(k);
                        j++;
                    } else {
                        sum += Integer.parseInt(num);
                    }
                }
            }
            f[i] = str + Math.abs(sum);
        }
        for (int k = 0; k < f.length; k++) {
            System.out.println(f[k]);
        }
    }
}
