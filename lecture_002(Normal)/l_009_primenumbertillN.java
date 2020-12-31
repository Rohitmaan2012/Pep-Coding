import java.util.Scanner;
public class l_009_primenumbertillN {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        int low = scn.nextInt();                  //int high = scn,nextInt();
        int high = scn.nextInt();                 //int low = scn.nextInt();
        primeNumberTillN(low,high);
    }
    public static void primeNumberTillN(int low, int high) {
        System.out.print("Prime Numbers between two numbers are: ");
        for(int n=low; n<=high; n++) {                 //for (int n=high; n>=low; n--)
            int count = 0;
            for(int div=2; div*div<=n; div++) {
                if(n%div == 0) {
                    count++;
                    break;
                }
            }
            if(count != 1) {
                System.out.print(n+" ");
            }
        }
    }
}