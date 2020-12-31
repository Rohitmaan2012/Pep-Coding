import java.util.Scanner;
public class l_003_spanofarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	int n = scn.nextInt();
    	int[] arr = new int[n];
    	input(arr);
        //display(arr);
    	maximum(arr);
    	minimum(arr);
        span(arr);
    }
    public static void display(int[] arr) {
    	for(int r: arr) {
    		System.out.print(r+" ");
    	}
    	System.out.println();
    }
    public static void input(int[] arr) {
    	for(int i=0; i<arr.length; i++) {
    		arr[i]=scn.nextInt();
    	}
        display(arr);
    }
    public static int maximum(int[] arr) {
    	int max = arr[0];
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i]>max) {
    			max = arr[i];
    		}
    	}
    	return max;
    }
    public static int minimum(int[] arr) {
    	int min = arr[0];
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i]<min) {
    			min = arr[i];
    		}
    	}
    	return min;
    }
    public static void span(int [] arr) {
    	int max1 = maximum(arr);
    	int min1 = minimum(arr);
    	System.out.println("Span: "+(max1-min1));	
    }
}