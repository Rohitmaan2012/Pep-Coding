import java.util.Scanner;
public class l_013_unboundedknapsack {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(unboundedKnapsack(n));
    }
    public static int unboundedKnapsack(int n) {
        int[] price = new int[n];
        for(int i=0; i<price.length; i++) {
            price[i] = scn.nextInt();
        }
        int[] weight = new int[n];
        for(int i=0; i<price.length; i++) {
            weight[i] = scn.nextInt();
        }
        int capacity = scn.nextInt();

        int[] dp = new int[capacity+1];
        dp[0] = 0;
        for(int j=1; j<dp.length; j++) {
            for(int i=0; i<weight.length; i++) {
                if(j-weight[i]>=0) {
                    dp[j] = Math.max(dp[j-weight[i]] + price[i], dp[j]);
                } 
            } 
        }
        return dp[capacity];
    }
}