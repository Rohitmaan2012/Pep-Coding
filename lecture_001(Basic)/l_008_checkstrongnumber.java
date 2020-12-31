import java.util.Scanner;
public class l_008_checkstrongnumber {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		strong(n);
	}
	public static int factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void strong(int n) {
		int sum = 0;
        int p = n;
		while(n!=0) {
			int l = n%10;
			int k = factorial(l);
			sum = sum + k;
			n/=10;
		}
        if(p==sum) {
            System.out.println(p+" is a strong number");
        }
        else {
            System.out.println(p+" is not a strong number");
        }
	}
}
		
	
 


	
	
 
