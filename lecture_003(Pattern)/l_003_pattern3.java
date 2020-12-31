import java.util.Scanner;
public class l_003_pattern3 {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		patternPyramid(n);
	}
	public static void patternPyramid(int n) {
		int nst = 1;
		int nsp = n-1;
		for(int r=1; r<=n; r++) {
			for(int csp=1; csp<=nsp; csp++) {
				System.out.print(" ");
			}
			for(int cst=1; cst<=nst; cst++) {
				System.out.print("*");
			}
			nst+=2;
			nsp--;
			System.out.println();
		}
	}
}
