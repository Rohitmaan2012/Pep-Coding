import java.util.Scanner;
public class l_001_fibonacci {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        //int[] qb = new int[n+1];
        System.out.println(fibonacci(n,new int[n+1]));
    }
    //DP with Memoization
    public static int fibonacci(int n, int[] qb) {
        if(n==0 || n==1) {
            return n; 
        }
        if(qb[n] != 0) {
            return qb[n]; 
        }
        int fnm1 = fibonacci(n-1,qb);
        int fnm2 = fibonacci(n-2,qb);
        int ans = fnm1 + fnm2;

        qb[n] = ans;
        return ans;
    }
}