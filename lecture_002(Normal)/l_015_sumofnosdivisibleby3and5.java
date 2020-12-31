import java.util.Scanner;
public class l_015_sumofnosdivisibleby3and5 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(sumdivisible(a,b));
    }
    public static int sumdivisible(int a, int b) {
        int sum = 0;
        for(int n=a; n<=b; n++) {
            if(n%3==0 && n%5==0) {
                sum = sum+n;
            }
        }
        return sum;
    }
}