import java.util.Scanner;
public class l_002_printincreasing {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        printIncreasing(n);
    }
    public static void printIncreasing(int n) {
        if(n==0) {
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}