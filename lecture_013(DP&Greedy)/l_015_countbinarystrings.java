import java.util.Scanner;
public class l_015_countbinarystrings {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(countBinaryStrings(n));
    }
    public static int countBinaryStrings(int n) {
        int old0 = 1;
        int old1 = 1;
        for(int i=2; i<=n; i++) {
            int new0 = old1;
            int new1 = old0 + old1;

            old0 = new0;
            old1 = new1;
        }
        return old0 + old1;
    }
    //-------------DP with tabulation----------//
    // public static int countBinaryStrings(int n) {
    //     int[] dp0 = new int[n+1];
    //     int[] dp1 = new int[n+1];

    //     dp0[1] = 1;
    //     dp1[1] = 1;

    //     for(int i=2; i<=n; i++) {
    //         dp1[i] = dp1[i-1] + dp0[i-1];
    //         dp0[i] = dp1[i-1];
    //     }
    //     return dp1[n] + dp0[n];
    // }
}
