import java.util.Scanner;
public class l_013_pythagoreantriplets {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        pythagoreantriplets(a,b,c);
    }
    public static void pythagoreantriplets(int a, int b, int c) {
        int hypotenuse;
        if(a>b && a>c) {
            hypotenuse = a;
        }
        else if(b>a && b>c) {
            hypotenuse = b;
        }
        else {
            hypotenuse = c;
        }
        if(hypotenuse == a) {
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } 
        else if(hypotenuse == b) {
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);
        } 
        else {
            boolean flag = ((a * a + b * b) == (c * c));
            System.out.println(flag);
        }
    }
}