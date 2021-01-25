import java.util.Scanner;
import java.util.Arrays;
public class l_011_coinchangecombination2 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(coinChangeCombination2(n));
    }
    public static int coinChangeCombination2(int n) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int amount = scn.nextInt();
        int max = amount+1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,max);
        dp[0] = 0;
        for(int j=1; j<dp.length; j++) {
            for(int i=0; i<arr.length; i++) {
                if(j-arr[i]>=0) {
                    dp[j] = Math.min(dp[j-arr[i]] + 1, dp[j]); 
                }
            } 
        }
        return dp[amount]; 
    }
}