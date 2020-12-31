import java.util.Scanner;
public class l_004_oneton {
    public static Scanner scn= new Scanner(System.in);
    public static void main(String[] args) {
        int a= scn.nextInt();
        int limit= scn.nextInt();
        for (int i=1; i<=limit; i++) {
            System.out.println(a+"*"+i+":"+a*i);
        }
    } 
}