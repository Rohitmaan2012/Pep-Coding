import java.util.Scanner;
public class l_010_printmazepathwithjumps {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePathWithJumps(1,1,n,m,"");
    }
    public static void printMazePathWithJumps(int sr, int sc, int dr, int dc, String path) {
        if(sr==dr && sc==dc) {
            System.out.println(path);
            return;
        }
        for(int ms=1; ms<=dc-sc; ms++) {
        	printMazePathWithJumps(sr, sc + ms, dr, dc, path + "h" + ms);
        }
        for(int ms=1; ms<=dr-sr; ms++) {
            printMazePathWithJumps(sr + ms, sc, dr, dc, path + "v" + ms);
        }
        for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++) {
            printMazePathWithJumps(sr + ms, sc + ms, dr, dc, path + "d" + ms);
        }
    }
}