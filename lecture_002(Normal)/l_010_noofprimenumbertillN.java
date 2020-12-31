import java.util.Scanner;
public class l_010_noofprimenumbertillN {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        int low = scn.nextInt();
        int high = scn.nextInt();
        primeNumberTillN(low,high);

    }
    public static void primeNumberTillN(int low, int high) {
        System.out.print("Prime Numbers between two numbers are: ");
        int count = 0;
        for(int n=low; n<=high; n++) {
            boolean flag = false;
            for(int div=2; div*div<=n; div++) {
                if(n%div == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                count++;
            }
        }
        System.out.print(count);
    }
}