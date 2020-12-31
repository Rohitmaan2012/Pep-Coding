import java.util.Scanner;
public class l_020_pattern20 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        rajneeshPattern20(n);
    }

    public static void rajneeshPattern20(int n) {
        int nst=n;
        for(int r=1; r<=n; r++) {
            for(int cst=1; cst<=nst; cst++) {
                if(cst==1 || cst==nst) {
                    System.out.print("*");
                }
                else if(r>n/2 && (r==cst || r+cst==n+1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
}