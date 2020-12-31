import java.util.Scanner;
public class l_014_pattern14 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n =scn.nextInt();
        rajneeshPattern10(n);
        //sumeetPattern10(n);
    } 

    public static void rajneeshPattern10(int n) {
        int nsp = n/2;
        int is = -1;
        for(int r=1; r<=n; r++) {
            for(int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for(int isp=1; isp<=is; isp++) {
                System.out.print(" ");
            }
            if(r>1 && r<n) {
                System.out.print("*");
            }

            if(r<=n/2) {
                nsp--;
                is+=2;
            }
            else
            { 
                is-=2;
                nsp++;
            }
            System.out.println();
        }
    }

    /*public static void sumeetPattern10(int n) {
        for(int r=1; r<=n; r++) {
            for(int cst=1; cst<=n; cst++) {
                if(r==cst || r+cst==n+1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" "); 
            }
            System.out.println();
        }
    }*/
}  