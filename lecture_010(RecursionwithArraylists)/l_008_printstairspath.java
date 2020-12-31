import java.util.Scanner;
public class l_008_printstairspath {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		printStairsPath(n,"");
	}
	public static void printStairsPath(int n, String path) {
		if(n==0) {
			System.out.println(path);
		}
		else if(n<0) {
			return;
		}
		printStairsPath(n-1,path+"1");
		printStairsPath(n-2,path+"2");
		printStairsPath(n-3,path+"3");
	}
}