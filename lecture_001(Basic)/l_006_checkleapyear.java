import java.util.Scanner;
public class l_006_checkleapyear {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		if(leapYear(n)) {     //if(leapYear(n)==true)
			System.out.println(n + " is a leap year\n");
		}
		else {
			System.out.println(n + " is not a leap year\n");
		}
	}
	public static boolean leapYear(int n) {
		if(n%400==0) {
			return true;
		}
		else if(n%100==0) {
			return false;
		}
		else if(n%4==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
	
	
 
