import java.util.Scanner;
public class l_004_barchartusingarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	int n = scn.nextInt();
    	int[] arr = new int[n];
    	input(arr);
    	//maximum(arr);
    	//minimum(arr);
        barchart(arr);
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
    public static void barchart(int[] arr) {
        int max1 = maximum(arr);
        for(int r=max1; r>=1; r--) {
            for(int i=0; i<arr.length; i++) {
                if(arr[i]>=r) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}