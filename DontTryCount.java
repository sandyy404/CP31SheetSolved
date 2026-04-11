
import java.util.Scanner;

public class DontTryCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
               int opr = 0;
            while (opr <= 5) {
                if (x.contains(s)) {
                    System.out.println(opr);
                    break;
                }
                x = x + x;
                opr++;
            }
            if (!x.contains(s)) {
                System.out.println(-1);
            }
            t--;
        }

    }
}
