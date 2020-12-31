import java.util.Scanner;
public class l_018_sumoffirstandlastdigit {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        int lastDigit = n%10;
        while(n>=10) {
            n/=10;
        }
        int firstDigit = n;
        int sum = firstDigit+lastDigit;
        return sum;
    }
}