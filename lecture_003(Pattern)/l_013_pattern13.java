import java.util.Scanner;
public class l_013_pattern13 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        //rajneeshPattern9(n);
        sumeetPattern9(n);
    }

    /*public static void rajneeshPattern9(int n) {
        int nst = n;
        for(int r=1; r<=n; r++) {
            for(int cst=1; cst<=nst; cst++) {
                if(r==cst || r+cst==n+1) {
                    System.out.print("*");
                }
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }*/

    public static void sumeetPattern9(int n) {
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
    }
}