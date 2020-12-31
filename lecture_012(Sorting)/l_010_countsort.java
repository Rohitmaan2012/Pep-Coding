import java.util.Scanner;
public class l_010_countsort {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();   
        int[] arr = new int[n];     //int[] arr = {9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        	min = Math.min(min,arr[i]);
        	max = Math.max(max,arr[i]);
        }
        countSort(arr,min,max);
        display(arr);
    }
    public static void display(int[] arr) {
    	for(int r: arr) {
    		System.out.print(r+" ");
    	}
    	System.out.println();
    }
    public static void countSort(int[] arr, int min, int max) {
    	int range = max-min+1;
    	int[] farr = new int[range];
    	//make frequency array
    	for(int i=0; i<arr.length; i++) {
    		int idx = arr[i]-min;
    		farr[idx]++;
    	}
		//convert it into prefix sum array
    	farr[0]--;
    	for(int i=1; i<farr.length; i++) {
    		farr[i] = farr[i] + farr[i-1];
    	}
    	int[] ans = new int[arr.length];
		//stable sorting(filling ans array)
    	for(int i=arr.length-1; i>=0; i--) {
    		int val = arr[i];
    		int idx = farr[val-min];
    		ans[idx] = val; 
    		//idx--;          //(wrong)
    		farr[val-min]--;  //(right)
    	}
		//fiiling original array with the help of ans array
        for(int i=0; i<arr.length; i++) {
    		arr[i] = ans[i];
        }
    }  
}