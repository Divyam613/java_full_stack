import java.util.Arrays;
import java.util.Scanner;

public class Anagramstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String");
        String str1 = sc.next();
        System.out.println("Enter second String");
        String str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // for(int i =0 ;i<charArray1.length;i++){
            // if(charArray1[i]!=charArray2[i]){
            // System.out.println("Not anagram");
            // }
            // }
            int flag;
            for (int i = 0; i < charArray1.length; i++) {
                flag = 1;
                if (charArray1[i] != charArray2[i]) {
                    flag = 0;
                }
                if (flag == 1)
                    System.out.println("Anagram");
                else
                    System.out.println("Not anagram ");
            }
        }
        sc.close();
    }
}
