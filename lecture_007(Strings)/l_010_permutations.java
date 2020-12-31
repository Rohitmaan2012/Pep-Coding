import java.util.Scanner;
public class l_010_permutations {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        permutations(s);
    }
    public static int factorial(int n) {
    	int fact = 1;
    	for(int i=2; i<=n; i++) {
    		fact *= i;
    	}
    	return fact;
    }
    public static void permutations(String s) {
    	int n = s.length();
    	int f = factorial(n);
    	for(int i=0; i<f; i++) {
            StringBuilder sb = new StringBuilder(s);
    		int temp =i;
    		for(int div=n; div>=1; div--) {
    			int q = temp/div;
    			int r = temp%div;
    			
    			System.out.print(sb.charAt(r));
    			sb.deleteCharAt(r);
    			
    			temp = q;
    		}
    		System.out.println();
    	}
    }
}