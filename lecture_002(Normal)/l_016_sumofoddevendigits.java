import java.util.Scanner;
public class l_016_sumofoddevendigits {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(sum(n));
    }
    public static int reverse(int n) {
        int rev = 0;
        while(n!=0) {
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
    public static int sum(int n) {
        n = reverse(n);
        int sumOdd = 0;
        int sumEven = 0;
        int c=1;
        while(n!=0) {
            if(c%2==0) {
                sumEven = sumEven + n%10;
            }
            else {
                sumOdd = sumOdd + n%10;
            }
            c++;
            n/=10;
        }
        return sumOdd;
    }
}