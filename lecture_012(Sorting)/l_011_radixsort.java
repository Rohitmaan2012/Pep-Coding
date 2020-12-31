import java.util.Scanner;
public class l_011_radixsort {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];        //int[] arr = {5,12,234,7,9875};
        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        display(arr);
    }
    public static void display(int[] arr) {
    	for(int r: arr) {
    		System.out.print(r+" ");
    	}
    	System.out.println();
    }
    public static void countSort(int[] arr, int exp) {
    	int[] farr = new int[10];
    	
    	for(int i=0; i<arr.length; i++) {
            int idx = arr[i]/exp % 10;
    		farr[idx]++;
    	}
    	for(int i=1; i<farr.length; i++) {
    		farr[i] = farr[i] + farr[i-1];
    	}
    	int[] ans = new int[arr.length];
	
    	for(int i=arr.length-1; i>=0; i--) {
            int val = arr[i]/exp % 10;
    		int pos = farr[val] - 1;
    		ans[pos] = arr[i]; 
    		farr[arr[i]/exp % 10]--; 
    	}

        for(int i=0; i<arr.length; i++) {
    		arr[i] = ans[i];
        }
    }
    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int val: arr) {
            if(val>max) {
                max = val;
            }
        }
        int exp = 1;
        while(exp<=max) {
            countSort(arr,exp);
            exp = exp*10;
        }
    }  
}