import java.util.Scanner;
public class l_020_perfectnumber {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		if(sum(n)) {
			System.out.println(n + " is a perfect number\n");
		}
		else {
			System.out.println(n + " is not a perfect number\n");
		}
	}
	public static boolean sum(int n) {
		int sum = 0;
		for(int div=1; div<=n/2; div++) {
			if(n%div==0) {
				sum = sum + div;
			}
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}	
	}
}
	
	
 
