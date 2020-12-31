import java.util.Scanner;
public class l_003_sumofdigits {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        int sum=0;
        while (num != 0) {
            sum= sum + num%10;
            num/=10;
        }
        System.out.println("Sum of digits:" + sum);
    }
}