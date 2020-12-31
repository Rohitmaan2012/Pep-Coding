import java.util.Scanner;
public class l_003_printdecreasingincreasing {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        printDecreasingIncreasing(n);
    }
    public static void printDecreasingIncreasing(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n-1);
        System.out.println(n);
    }
}