import java.util.Scanner;
public class l_016_arrangebuildings {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(arrangeBuildings(n));
    }
    public static int arrangeBuildings(int n) {
        int oldb = 1;
        int olds = 1;
        for(int i=2; i<=n; i++) {
            int newb = olds;
            int news = oldb + olds;

            oldb = newb;
            olds = news;
        }
        return (oldb + olds)*(oldb + olds);
    }
}