import java.util.Scanner;

public class Atmmachine {
    public static void main(String[] args) {
        int n = 162;
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose an option");
        System.out.println("1. check Balance");
        System.out.println("2. Deposit money");
        System.out.println("3. withdraw money");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("your current balance is:" + n);
                break;
            case 2:
                System.out.println("enter money you want to deposite");
                int y = scanner.nextInt();
                System.out.println("amount deposited /ncurrent balance is:" + (y + n));
                break;
            case 3:
                System.out.println("amount");
                int e = scanner.nextInt();
                System.out.println("thankyou /ncurrent balance:" + (n - e));
                break;
            default:

        }
        scanner.close();
    }
}
