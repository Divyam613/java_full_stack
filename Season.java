import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.january");
        System.out.println("2. february");
        System.out.println("3. march");
        System.out.println("4. april");
        System.out.println("5. may");
        System.out.println("6. june");
        System.out.println("7. july");
        System.out.println("8. august");
        System.out.println("9. september");
        System.out.println("10. october");
        System.out.println("11. november");
        System.out.println("12. december");

        int ch = sc.nextInt();

        switch (ch) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            default:
        }
        sc.close();
    }
}
