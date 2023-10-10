import java.util.Scanner;

public class evenodd {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the range");
      int a = sc.nextInt();
      int i;

      for (i = 0; i <= a; i++) {
        if (i % 2 == 0) {
          System.out.println("Even number:" + i);
        } else {
          System.out.println("Odd number:" + i);
        }

      }
    }
  }
}