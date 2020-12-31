import java.util.Scanner;
public class l_006_powerlogarithmic {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xn = power(x,n);
        System.out.println(xn);
    }
    public static int power(int x, int n) {
        if(n==0) {
            return 1;
        }
        int xnd2 = power(x,n/2);
        int xn = xnd2*xnd2;

        if(n%2==1) {
            xn = xn*x;
        }
        return xn;
    } 
}