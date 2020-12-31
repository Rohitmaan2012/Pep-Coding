import java.util.Scanner;
public class l_019_digitfrequency {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int a = scn.nextInt();
        System.out.println(digitFrequency(n,a));
    }
    public static int digitFrequency(int n, int a) {
        int count = 0;
        while(n!=0) {
            if(n%10==a) {
                count++;
            }
            n/=10;
        }
        return count;
    }
}