import java.util.Scanner;
import java.util.ArrayList;
public class l_005_getmazepathwithjumps {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> result = getMazePathWithJumps(1,1,n,m);
        System.out.println(result);
    }
    public static ArrayList<String> getMazePathWithJumps(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        //horizontal moves
        for(int ms=1; ms<=dc-sc; ms++) {
            ArrayList<String> hpaths = getMazePathWithJumps(sr, sc + ms, dr, dc);
            for(String hpath: hpaths) {
                paths.add("h" + ms + hpath);
            }
        }
        //vertical moves
        for(int ms=1; ms<=dr-sr; ms++) {
            ArrayList<String> vpaths = getMazePathWithJumps(sr + ms, sc, dr, dc);
            for(String vpath: vpaths) {
                paths.add("v" + ms + vpath);
            }
        }
        //diagonal moves
        for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++) {
            ArrayList<String> dpaths = getMazePathWithJumps(sr + ms, sc + ms, dr, dc);
            for(String dpath: dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}