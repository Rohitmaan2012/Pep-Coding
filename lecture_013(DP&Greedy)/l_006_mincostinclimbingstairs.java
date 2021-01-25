import java.util.Scanner;
public class l_006_mincostinclimbingstairs {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(minCostInClimbingStairs(n));
    }
    //DP with Tabulation
    public static int minCostInClimbingStairs(int n) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int n1=0;
        int n2=0;
        for(int i=arr.length-1; i>=0; i--) {
            int c = arr[i] + Math.min(n1,n2);
            n2 = n1;
            n1 = c;
        }
        return Math.min(n1,n2);
    }
}
