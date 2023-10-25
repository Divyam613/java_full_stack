import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente the year");
        int a = sc.nextInt();

        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println("this is leap yaer");
                } else {
                    System.out.println("not a leap year");
                }
            } else {
                System.out.println(" a leap year");
            }

        } else {
            System.out.println("not a leap year");
        }
        sc.close();
    }
}
