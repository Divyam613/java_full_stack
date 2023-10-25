import java.util.Scanner;

public class Demoe {
    public static void main(String[] args) {
        System.out.println("1 for drink");
        System.out.println("2 for burger");
        System.out.println("3 for ice cream");
        // System.out.println("4 for pasta");
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("you ordered drink");
                break;
            case 2:
                System.out.println("you ordered burger");
                break;
            case 3:
                System.out.println("you ordered ice cream");
                break;
            default:

        }
        scanner.close();
    }
}
