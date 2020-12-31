import java.util.Scanner;
public class l_005_inversenumber {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int inv=0;
        int op=1;
        
        while(n!=0) {
        int od = n%10;
        int id = op;
        int ip = od;

        inv = inv + id * (int)Math.pow(10, ip-1);

        n/=10;
        op++; 
    }
    System.out.println("Inverse Number: "+ inv);
    }
}