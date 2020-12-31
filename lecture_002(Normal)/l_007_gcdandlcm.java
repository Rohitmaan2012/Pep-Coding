import java.util.Scanner;
public class l_007_gcdandlcm {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        gcdAndLcm(a,b);
        //int c = scn.nextInt();
        //gcdAndLcm2(a,b,c);
    }
    public static void gcdAndLcm(int a, int b) {
        int oa = a;
        int ob = b;
        while(a%b != 0) {
            int rem = a%b;  
            a = b;        // a becomes b
            b = rem;      // b becomes remainder 
        }
        System.out.println("GCD: "+ b);
        System.out.println("LCM: "+ (oa*ob)/b);
    }
    /* public static void gcdAndLcm2(int a, int b, int c) {
        int oa = a;
        int ob = b;
        int oc = c;
        while(a%b != 0) {
            int rem1 = a%b;
            a = b;
            b = rem1;
        }
        while(c%b != 0) {
            int rem2 = c%b;
            c = b;
            b = rem2;
        }
        System.out.println("GCD: "+b);
    } */
}