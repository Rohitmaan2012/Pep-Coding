import java.util.Scanner;
public class l_006_anybasemultiplication {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(getProduct(n1, n2, b)); 
    }
    public static int anyBaseAddition(int n1, int n2, int b) {
        int rv = 0;
        int p = 1;
        int c= 0;
        while(n1>0 || n2>0 || c>0) {
            int d1 = n1%10;
            int d2 = n2%10;
            
            n1/=10;
            n2/=10;

            int d = d1+d2+c;
            c=d/b;
            d=d%b;

            rv= rv+d*p;
            p*=10;
        }
        return rv;
    }
    public static int product1(int n1, int k, int b) {
    	int rv = 0;
    	int p = 1;
    	int c = 0;
    	while(n1>0 || c>0) {
    		int d1 = n1%10;
    		n1/=10;
    		
    		int d = d1*k + c;
    		c = d/b;
    		d = d%b;
    		
    		rv = rv + d*p;
    		p *= 10;
    	}
    	return rv;
    }
    public static int getProduct(int n1, int n2 , int b) {
    	int rv = 0;
    	int p = 1;
    	while(n2>0) {
    		int d2 = n2%10;
    		n2/=10;
    		
    		int product = product1(n1, d2, b);
    		rv = anyBaseAddition(rv, product*p, b);
    		p = p*10;
    	}9
    	return rv;
    }
}