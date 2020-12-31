import java.util.Scanner;
public class l_003_elseif {
    public static Scanner scn= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter three values a,b and c:");
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();

        if (a>b && a>c) {
            System.out.print("a is greatest");
        }
        else if (b>a && b>c) {
            System.out.print("b is greatest");
        }
        else {
            System.out.print("c is greatest");
        }
    }
}