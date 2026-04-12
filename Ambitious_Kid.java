
import java.util.ArrayList;
import java.util.Scanner;

public class Ambitious_Kid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        if (al.contains(0)) {
            System.out.println(0);
        } else if (al.size() == 1) {
            System.out.println(Math.abs(al.get(0)));
        } else {
            int num = Math.abs(al.get(0));
            for (int i = 1; i < n; i++) {
                int a = al.get(i);
                a = Math.abs(a);
                num = Math.min(num, a);
            }
            System.out.println(num);
        }
    }
}
