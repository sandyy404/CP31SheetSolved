import java.util.Scanner;

// not solved yet.


public class DoremyPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (n <= 2) {
                System.out.println("Yes");
                t--;
                continue; 
            }
            int targetSum = a[0] + a[1];
            boolean valid = true;
            for (int i = 0; i < n - 1; i += 2) {
                if (i + 1 >= n) break;
                int lsum = a[i] + a[i + 1];
                if (lsum != targetSum) {
                    valid = false; 
                    break;
                }
            }
            System.out.println(valid ? "Yes" : "No"); 
            t--;
        }
    }
}