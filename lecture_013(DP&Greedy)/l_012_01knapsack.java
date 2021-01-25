import java.util.Scanner;
public class l_012_01knapsack {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(zeroOneKnapsack(n));
    }
    public static int zeroOneKnapsack(int n) {
        int[] price = new int[n];
        for(int i=0; i<price.length; i++) {
            price[i] = scn.nextInt();
        }
        int[] weight = new int[n];
        for(int i=0; i<price.length; i++) {
            weight[i] = scn.nextInt();
        }
        int capacity = scn.nextInt();

        int[][] dp = new int[n+1][capacity+1];
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                int val = weight[i-1];
                if(j>=val) {
                    if(dp[i-1][j-val] + price[i-1] > dp[i-1][j]) {
                        dp[i][j] = dp[i-1][j-val] + price[i-1];
                    }
                    else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else {
                    dp[i][j] = dp[i-1][j];
                } 
            }
        }
        return dp[n][capacity];
    }
}