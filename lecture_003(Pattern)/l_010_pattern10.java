import java.util.Scanner;
public class l_010_pattern10 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        patternBinomial(n);
    }
    public static void patternBinomial(int n) {
        
        for (int r=0; r<n; r++) {
            int val = 1;
            for (int cst=0; cst<=r; cst++) {
                System.out.print(val+"\t");
                val = (val*(r-cst))/(cst+1);
            }
            System.out.println();
        }
    }
}