import java.util.Scanner;
public class l_004_printfactorial {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int f = factorial(n);
        System.out.println(f);
    }
    public static int factorial(int n) {
        if(n==1) {
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n*fnm1;
        return fn;        
    }
}