import java.util.Scanner;
public class l_014_benjaminbulbs {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        benjaminbulbs(n);
    }
    public static void benjaminbulbs(int n) {   //n=no. of bulbs or no. of fluctuations
        System.out.print("Bulbs that would be switched on are: ");
        int count = 0;
        for(int i=1; i*i<=n; i++) {
            System.out.println(i*i);
            count++;
        }
        System.out.println("No of bulbs that would be switched on are: "+ count);
    }
}