import java.util.Scanner;
import java.util.ArrayList;

public class l_001_getsubsequence {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String str = scn.next();
        ArrayList<String> result = gss(str);
        System.out.println(result); 
    }
    //Faith: bc -> [--, -c, b-, bc]
    //Exp: abc -> [---, --c, -b-, -bc, a--, a-c, ab-, abc] 
    public static ArrayList<String> gss(String str) {
        if(str.length()==0) {
            ArrayList<String> baseres = new ArrayList<>();  //baseres = baseresult
            baseres.add("");                               
            return baseres; 
        }   
        char ch = str.charAt(0);   //a   -> 1
        String ros = str.substring(1);  //bc  -> 2          //ros = rest of string
        ArrayList<String> rres = gss(ros);   //[--, -c, b-, bc]   -> 3

        ArrayList<String> myans = new ArrayList<>();   //->4     //myans = my answer
        for(String rstr: rres) {                               
            myans.add("-" + rstr);                    //->5
        }
        for(String rstr: rres) {
            myans.add(ch + rstr);                     //->5
        }
        return myans;                               //->6
    }
}