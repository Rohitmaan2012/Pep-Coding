import java.util.Scanner;
public class l_009_quickselect {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n =scn.nextInt();
        int[] arr = new int[n];
        input(arr);
		int k = scn.nextInt();
		System.out.println(quickSelect(arr,0,arr.length-1,k-1));
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
	public static void swap(int[] arr, int i ,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static int partitionArray(int[] arr, int p, int l, int h) {
		int i=l;
		int j=l;
		while(i<=h) {
			if(arr[i]>p) {
				i++;
			}
			else {
				swap(arr,i,j);
				i++;
				j++;
			}
		}
		return j-1;
	}
	public static int quickSelect(int[] arr, int l, int h, int k) {
		int p = arr[h];
        int pi = partitionArray(arr,p,l,h);

        if(k<pi) {
            return quickSelect(arr,l,pi-1,k);
        }
        else if(k>pi) {
            return quickSelect(arr,pi+1,h,k);
        }
		else {
            return arr[pi];
        }
	}
}