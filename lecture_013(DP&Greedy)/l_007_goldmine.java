import java.util.Scanner;
public class l_007_goldmine {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(goldmine(n,m));
    } 
    public static int goldmine(int n, int m) {
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        for(int j=dp[0].length-1; j>=0; j--) {
            for(int i=dp.length-1; i>=0; i--) {
                if(j==dp[0].length-1) {
                    dp[i][j] = arr[i][j];
                }
                else if(i==0) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i==dp.length-1) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], Math.max(dp[i-1][j+1],dp[i+1][j+1]));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0,j=0; i<dp.length; i++) {
            max = Math.max(dp[i][j],max);
        }
        return max;
    }
}