import java.util.Scanner;
public class l_007_printzigzag {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        pzz(n);
    }
    public static void pzz(int n) {
        if(n==0) {
            return;
        }
        System.out.println("Pre "+n);
        pzz(n-1);
        System.out.println("In "+n);
        pzz(n-1);
        System.out.println("Post "+n);
    }
}