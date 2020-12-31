import java.util.Scanner;
public class l_006_mergesort {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	int n = scn.nextInt();
    	int[] arr = new int[n];
    	input(arr);
    	display(mergeSort(arr,0,arr.length-1));
    }
    public static void display(int[] arr) {
    	for(int r: arr) {
    		System.out.print(r+" ");
    	}
    	System.out.println();
    }
    public static void input(int[] arr) {
    	for(int i=0; i<arr.length; i++) {
    		arr[i] = scn.nextInt();
    	}
    	display(arr);
    }
    public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
    	int[] ans = new int[one.length+two.length];
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	while(i<one.length && j<two.length) {
    		if(one[i]>two[j]) {
    			ans[k] = two[j];
    			j++; 			
    		}
    		else if(one[i]<two[j]) {
    			ans[k] = one[i];
    			i++;
    		}
    		k++;
    	}
    	while(i<one.length) {
    		ans[k] = one[i];
    		i++;
    		k++;
    	}
    	while(j<two.length) {
    		ans[k] = two[j];
    		j++;
    		k++;
    	}
    	return ans;
    }
    public static int[] mergeSort(int[] arr, int l, int h) {
    	if(l==h) {
    		int[] base = new int[1];
    		base[0] = arr[l];
    		return base;
    	}
    	int m = (l+h)/2;
    	int[] brr = mergeSort(arr,l,m);
    	int[] crr = mergeSort(arr,m+1,h);
    	int[] ans = mergeTwoSortedArrays(brr,crr);
    	return ans;
    }
}

