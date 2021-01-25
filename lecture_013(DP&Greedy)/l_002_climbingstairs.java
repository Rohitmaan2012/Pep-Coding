import java.util.Scanner;
import java.util.ArrayList;
public class l_002_climbingstairs {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        //System.out.println(climbingStairs(n,new int[n+1]));
        System.out.println(climbingStairsTab(n));
    }
    //DP with Memoization
    public static int climbingStairs(int n, int[] qb) {
        if(n==0) {
            return 1;
        }
        else if(n<0) {
            return 0;
        }
        if(qb[n]>0) {        //if(qb[n] != 0)
            return qb[n];
        }
        int nm1 = climbingStairs(n-1,qb);
        int nm2 = climbingStairs(n-2,qb);
        int nm3 = climbingStairs(n-3,qb);
        int ans = nm1 + nm2 + nm3;

        qb[n] = ans;
        return ans;
    }
    //DP with Tabulation
    public static int climbingStairsTab(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++) {
            if(i==1) {
                dp[i] = dp[i-1];
            }
            else if(i==2) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            else {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }
}
