import java.util.Scanner;
public class l_012_fibonaccinumbertillN {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Number: ");
        int n = scn.nextInt();
        System.out.print("a: ");
        int a = scn.nextInt();
        System.out.print("b: ");
        int b = scn.nextInt();
        fibonacciSeries(n,a,b);
    }

    public static void fibonacciSeries(int n, int a, int b) {
        for(int i=1; i<=n; i++) {
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}