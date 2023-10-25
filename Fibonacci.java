import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int n = sc.nextInt();

        int fab_1 = 0;
        int fab_2 = 1;

        System.out.println("fabonacci series upto" + n);

        for (int i = 1; i < n; i++) {
            System.out.println(fab_1 + " ");
            int fab_3 = fab_1 + fab_2;
            fab_1 = fab_2;
            fab_2 = fab_3;
        }
        sc.close();
    }
}
