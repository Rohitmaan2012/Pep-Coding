import java.util.Scanner;
public class l_019_maxsumnonadjacentelements {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        System.out.println(maxsumadjacentelements(n));
    }
    public static int maxsumadjacentelements(int n) {
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int oldinc = arr[0];
        int oldexc = 0;
        for(int i=1; i<arr.length; i++) {
            int newinc = oldexc + arr[i];
            int newexc = Math.max(oldinc, oldexc);

            oldinc = newinc;
            oldexc = newexc;
        }
        return Math.max(oldinc,oldexc);
    }
}