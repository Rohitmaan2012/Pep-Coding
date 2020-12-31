import java.util.Scanner;
public class l_002_maxminvalueinarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	int n = scn.nextInt();
    	int[] arr = new int[n];
    	input(arr);
    	maximum(arr);
    	minimum(arr);
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
    public static void maximum(int[] arr) {
    	int max = arr[0];
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i]>max) {
    			max = arr[i];
    		}
    	}
    	System.out.println("Maximum: "+ max);
    }
    public static void minimum(int[] arr) {
    	int min = arr[0];
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i]<min) {
    			min = arr[i];
    		}
    	}
    	System.out.println("Minimum: "+ min);
    }
}