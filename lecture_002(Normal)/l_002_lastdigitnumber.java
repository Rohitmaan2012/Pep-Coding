import java.util.Scanner;
public class l_002_lastdigitnumber {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        num %= 10;
        System.out.println("Last digit number:" + num);
    }
}