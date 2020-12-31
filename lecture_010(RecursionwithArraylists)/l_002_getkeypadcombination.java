import java.util.Scanner;
import java.util.ArrayList;

public class l_002_getkeypadcombination {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.nextLine();
        ArrayList<String> words = getKpc(str);
        System.out.println(words);
    }
    //Global String Array
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKpc(String str) {
        if(str.length()==0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);  //6
        String ros = str.substring(1);    //78
        ArrayList<String> rres = getKpc(ros);

        ArrayList<String> myans = new ArrayList<>();
        String deep = codes[ch-'0'];
        for(int i=0; i<deep.length(); i++) {
            char ch1 = deep.charAt(i);
            for(String rstr: rres) {
                myans.add(ch1+rstr);
            }
        }
        return myans;
    }
}