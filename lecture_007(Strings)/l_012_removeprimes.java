import java.util.Scanner;
import java.util.ArrayList;
public class l_012_removeprimes {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0; i<n; i++) {
        	a1.add(scn.nextInt());
        }
        System.out.println(a1);
        System.out.println(removePrimes(a1));
    }
    public static boolean checkPrime(int n) {
    	for(int div=2; div*div<=n; div++) {
    		if(n%div==0) {
    			return false;
    		}
    	}
    	return true;
    }
    public static ArrayList<Integer> removePrimes(ArrayList<Integer> a1) {
    	for(int i=a1.size()-1; i>=0; i--) {
    		int val = a1.get(i);
    		if(checkPrime(val)==true) {
    			a1.remove(i);
    		}
    		
    	}
    	return a1;
    }
}