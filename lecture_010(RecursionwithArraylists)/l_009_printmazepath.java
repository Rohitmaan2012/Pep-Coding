import java.util.Scanner;
public class l_009_printmazepath {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePath2(1,1,n,m,"");
    }
    public static void printMazePath1(int sr, int sc, int dr, int dc, String path) {
        if(sr>dc || sc>dc) {
            return;
        }
        if(sr==dr && sc==dc) {
            System.out.println(path);
            return;
        }
        printMazePath1(sr,sc+1,dr,dc,path+"h");
        printMazePath1(sr+1,sc,dr,dc,path+"v");    
    }
    public static void printMazePath2(int sr, int sc, int dr, int dc, String path) {
        if(sr==dr && sc==dc) {
            System.out.println(path);
            return;
        }
        if(sc<dc) {
            printMazePath2(sr,sc+1,dr,dc,path+"h");
        }
        if(sr<dr) {
            printMazePath2(sr+1,sc,dr,dc,path+"v");
        }
    }
}