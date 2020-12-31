import java.util.Scanner;
public class l_017_sumofoddevennosinanumber {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        while(n!=0) {
            int lastDigit = n%10;
            if(lastDigit%2==0) {
                sumEven = sumEven + n%10;
            }
            else {
                sumOdd = sumOdd + n%10;
            }
            n/=10;
        }
        return sumOdd;
    }
}