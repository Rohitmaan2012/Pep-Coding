import java.util.Scanner;
public class l_012_sortdates {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        //int n = scn.nextInt();                    //(wrong)
        int n = Integer.parseInt(scn.nextLine());   //(right)
        String[] srr = new String[n];
        for(int i=0; i<n; i++) {
            srr[i] = scn.nextLine();
        }
        sortDates(srr);
        System.out.println();
        display(srr);
    }
    public static void display(String[] arr) {
    	for(String r: arr) {
    		System.out.println(r);
    	}
    	System.out.println();
    }
    public static void countSort(String[] arr, int div, int mod, int range) {
    	int[] farr = new int[range];
    	
    	for(int i=0; i<arr.length; i++) {
            int idx = Integer.parseInt(arr[i],10)/div % mod;
    		farr[idx]++;
    	}
    	for(int i=1; i<farr.length; i++) {
    		farr[i] = farr[i] + farr[i-1];
    	}
    	String[] ans = new String[arr.length];
	
    	for(int i=arr.length-1; i>=0; i--) {
            int val = Integer.parseInt(arr[i],10)/div % mod;
    		int pos = farr[val] - 1;
    		ans[pos] = arr[i]; 
    		farr[Integer.parseInt(arr[i],10)/div % mod]--; 
    	}

        for(int i=0; i<arr.length; i++) {
    		arr[i] = ans[i];
        }
    }
    public static void sortDates(String[] arr) {
        countSort(arr,1000000,100,32);    //days
        countSort(arr,10000,100,13);      //months
        countSort(arr,1,10000,2501);      //years
    }  
}