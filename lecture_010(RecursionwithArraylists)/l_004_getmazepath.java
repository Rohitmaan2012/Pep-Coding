import java.util.Scanner;
import java.util.ArrayList;

public class l_004_getmazepath {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> result = getMazePath2(1,1,n,m);
        System.out.println(result);
    }
    //sr = source row;
    //sc = source column;
    //dr = destination row;
    //dc = destination column;
    public static ArrayList<String> getMazePath1(int sr, int sc, int dr, int dc) {
		if(sr>dr || sc>dc) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		if(sr==dr && sc==dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		ArrayList<String> hpaths = getMazePath1(sr,sc+1,dr,dc);
		ArrayList<String> vpaths = getMazePath1(sr+1,sc,dr,dc);
		
		ArrayList<String> paths = new ArrayList<>();
		
		for(String path: hpaths) {
			paths.add("h"+path);
		}
		for(String path: vpaths) {
			paths.add("v"+path);
		}
		return paths;
	}
    public static ArrayList<String> getMazePath2(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc<dc) {
            hpaths = getMazePath2(sr,sc+1,dr,dc);
        }
        if(sr<dr) {
            vpaths = getMazePath2(sr+1,sc,dr,dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String path: hpaths) {
            paths.add("h"+path);
        }
        for(String path: vpaths) {
            paths.add("v"+path);
        }
        return paths;
    }
}