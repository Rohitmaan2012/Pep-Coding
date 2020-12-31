import java.util.Scanner;
public class l_001_noofdigits {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        int count = 0;
        while(num != 0) {

            num=num/10;
            count++;

        }
        System.out.println("No. of digits:"+ count);
    }
}