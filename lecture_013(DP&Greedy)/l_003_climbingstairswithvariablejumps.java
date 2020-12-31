import java.util.Scanner;
public class l_003_climbingstairswithvariablejumps {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(climbingStairsWithVariableJumps(n));
    }
    //DP with Tabulation
    public static int climbingStairsWithVariableJumps(int n) {
        int[] dp = new int[n+1];
        dp[n] = 1;
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        for(int i=n-1; i>=0; i--) {
            for(int j=1; j<=arr[i] && i+j<dp.length; j++) {
                dp[i] += dp[i+j];
            }
        }
        return dp[0];
    }
}