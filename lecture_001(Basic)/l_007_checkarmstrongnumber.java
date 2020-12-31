import java.util.Scanner;
public class l_007_checkarmstrongnumber {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		armstrong(n);
	}
	public static void armstrong(int n) {
		int sum = 0;
		int o = n;
		while(n!=0) {
			int l = n%10;
			sum = sum + (int)Math.pow(l,3);
			n/=10;
		}
		if(o==sum) {
			System.out.println(o + " is a armstrong number");
		}
		else {
			System.out.println(o + " is not a armstrong number");
		}
	}
}
	
	
 


	
	
 
