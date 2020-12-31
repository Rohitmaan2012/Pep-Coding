import java.util.Scanner;
public class l_008_pattern8 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        patternDiamondNumber3(n);
    }
    public static void patternDiamondNumber3(int n) {
        int nst=1;
        int nsp=n/2;  
        for (int r=1; r<=n; r++) { 
            for (int csp=1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            int val = r;
            if(r>=n/2+1) {     //if(r>n/2+1)
                val = n-r+1;
            }
            for(int cst=1; cst<=nst; cst++) {
                System.out.print(val);
                if(cst<=nst/2) {
                    val++;
                }
                else
                val--;
            }
            if(r<=n/2) {       //if(r<n/2+1)
                nst+=2;
                nsp--;
            }
            else {
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
    }
}



