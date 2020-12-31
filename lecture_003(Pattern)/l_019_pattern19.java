import java.util.Scanner;
public class l_019_pattern19 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        rajneeshPattern19(n);
    }
    public static void rajneeshPattern19(int n) {
        int nst= n;
        for(int r=1; r<=n; r++) {
            for(int cst=1; cst<=nst; cst++) {
                if(r==1) {
                    if(cst<=nst/2+1 || cst==nst) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else if(r<=n/2) {
                    if(cst==n/2+1 || cst==n) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else if(r==n/2+1) {
                    System.out.print("*");
                }
                else if(r<n) {
                    if(cst==1 || cst==n/2+1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    if(cst==1 || cst>=n/2+1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}