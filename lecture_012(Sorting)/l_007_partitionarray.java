import java.util.Scanner;
public class l_007_partitionarray {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
        int n = scn.nextInt();
		int[] arr = new int[n];
		input(arr);
		int p = scn.nextInt();
        display(partitionArray1(arr,p));
		display(partitionArray2(arr,p));
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
	public static int[] partitionArray1(int[] arr, int p) {
		int[] sol = new int[arr.length];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<=p) {
				sol[k]= arr[i];
				k++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>p) {
				sol[k] = arr[i];
				k++;
			}
		}
		return sol;
	}
	public static void swap(int[] arr, int i ,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int[] partitionArray2(int[] arr, int p) {
		// i to end   ->   unknown
		// j to i-1   ->   >pivot
		// 0 to j-1   ->   <=pivot
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]>p) {
				i++;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return arr;
	}
}