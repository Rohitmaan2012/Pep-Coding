import java.util.Scanner;
public class l_005_anybasesubtraction {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n2 = scn.nextInt();
        int n1 = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(getDifference(n2,n1,b));
    }
    public static int getDifference(int n2, int n1, int b) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while(n2>0) {
            int d1 = n1%10;
            int d2 = n2%10;
            
            n1/=10;
            n2/=10;
            
            int d = 0;
            if(d2+c>=d1) {
            	d = d2+c-d1;
            	c=0;
            }
            else {
            	d = d2+b+c-d1;
            	c=-1;
            }
            rv= rv+d*p;
            p*=10;
        }
        return rv;
    }
}
