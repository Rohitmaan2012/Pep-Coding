import java.util.ArrayList;
import java.util.Scanner;
public class l_001_arraylist {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        solution(list);
    }
    public static void solution(ArrayList<Integer> list) {
        //Add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list+"->"+list.size());

        //Get
        int val = list.get(1);
        System.out.println(val);
        
        //Insert
        list.add(1,1000);
        System.out.println(list+"->"+list.size());

        //Replace
        list.set(1,2000);
        System.out.println(list+"->"+list.size());

        //Delete
        list.remove(1);
        System.out.println(list+"->"+list.size());
    }
}
