
import java.util.Scanner;

public class Blank_Space {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int mzero = 0;
        while (t > 0) {
            int n = sc.nextInt();
            int zero = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == 0) {
                    zero++;
                } else {
                    zero = 0;
                }
                mzero = Math.max(mzero, zero);
            }
            System.out.println(mzero);
            mzero =0;
            t--;
        }
    }
}
