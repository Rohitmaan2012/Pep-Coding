import java.util.Scanner;
public class l_009_coinchangecombination1 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(coinChangeCombination1(n));
    }
    public static int coinChangeCombination1(int n) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int amount = scn.nextInt();
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int i=0; i<arr.length; i++) {
            for(int j=arr[i]; j<dp.length; j++) {
                dp[j] += dp[j-arr[i]];
            }
        }
        return dp[amount]; 
    }
}