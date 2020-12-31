import java.util.Scanner;
public class l_004_reversenumber {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        int num = scn.nextInt();
        int rev=0;
        while (num != 0) {
            rev = rev*10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse number is:" + rev);
    }
}