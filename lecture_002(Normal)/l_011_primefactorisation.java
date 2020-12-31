import java.util.Scanner;
public class l_011_primefactorisation {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        primefactors(n);
    }
    public static void primefactors(int n) {
        for(int div=2; div*div <= n; div++) {
            while( n%div == 0) {
                n /= div;
                System.out.print(div+" ");
            }
        }
        if(n!=1) {
            System.out.println(n);
        }
        
    }
}