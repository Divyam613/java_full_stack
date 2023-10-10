import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the of the week");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("it's sunday");
                break;

            case 2:
                System.out.println("it's monday");
                break;
            case 3:
                System.out.println("it's tuesday");
                break;
            case 4:
                System.out.println("it's wednesday");
                break;
            case 5:
                System.out.println("it's thursday");
                break;
            case 6:
                System.out.println("it's friday");
                break;
            case 7:
                System.out.println("it's saturday");
                break;
            default:
                System.out.println("week only has 7 DAYS");

                sc.close();
        }
    }
}
