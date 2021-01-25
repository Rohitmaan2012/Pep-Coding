import java.util.Scanner;
public class l_010_coinchangepermutation {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(coinChangePermutation(n));
    }
    public static int coinChangePermutation(int n) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int amount = scn.nextInt();
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int j=1; j<dp.length; j++) {
            for(int i=0; i<arr.length; i++) {
                if(j-arr[i]>=0) {
                    dp[j] += dp[j-arr[i]]; 
                }
            } 
        }
        return dp[amount];
    }
}