import java.util.Scanner;
public class  l_006_rotationofnumber {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int r = scn.nextInt();
        rotation(n,r);
    }

    public static int noOfDigits(int n) {
        int count = 0;
        while(n!=0) {
            n/=10;
            count++;
        }
        return count;
    }
    public static void rotation(int n, int r) {
        int digit = noOfDigits(n);  
        r %= digit;
        r = r<0?r+digit:r;   // to find the rotation in simplified value

        int div=1;
        int mul=1;

        for(int i=1; i<=digit; i++) {    // to find the divider and multiplier 
            if(i<=r) {
                mul *= 10;
            }
            else
            div *= 10;
        }
        int ans = (n % div)*mul + n/div;
        System.out.println(ans);
    }
}