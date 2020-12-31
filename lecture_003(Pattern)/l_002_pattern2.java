import java.util.Scanner;
public class l_002_pattern2 {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int nst = 1;
		int nsp = n-1;
		patternMirror(n,nst,nsp);
	}
	
	public static void patternMirror(int n, int nst, int nsp) {
		for(int r=1; r<=n; r++) {
			for(int cst=1; cst<=nst; cst++) {
				System.out.print("*");
			}
			for(int csp=1; csp<=nsp; csp++) {
				System.out.print(" ");
			}
			nst++;
			nsp--;
			System.out.println();
		}
	}
	
}
