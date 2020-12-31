import java.util.Scanner;
public class l_012_subsetsofarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	int n = scn.nextInt();
    	int[] arr = new int[n];
    	input(arr);
    	//maximum(arr);
    	//minimum(arr);
        //System.out.println(find(arr,34));
        //swap(arr,0,3);
        //reverse(arr,0,n-1);
        //int r = scn.nextInt();
        //rotate1(arr,r);
        //rotate2(arr,r);
        //subarrays(arr);
        subsetsofarray(arr);
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
    		if(arr[i]>=max) {
    			max = arr[i];
    		}
    	}
    	System.out.println("Maximum: "+ max);
    }
    public static void minimum(int[] arr) {
    	int min = arr[0];
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i]<=min) {
    			min = arr[i];
    		}
    	}
    	System.out.println("Minimum: "+ min);
    }
    public static boolean find(int[] arr, int data) {
        for(int ele: arr) {
            if(ele==data) {
                return true;
            }
        }
        return false;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        //display(arr);
    }
    public static void reverse(int[] arr, int si, int ei) {
        while(si<ei) {
            swap(arr,si,ei);
            si++;
            ei--;
        }
        //display(arr);
    }
    public static void rotate1(int[] arr, int r) {
        r%=arr.length;
        r = r<0?r+arr.length:r;
        int[] ans = new int[arr.length]; 
        int k=0;
        for(int i=r; i<arr.length; i++) {
            ans[k] = arr[i];
            k++;
        }
        for(int i=0; i<r; i++) {
            ans[k] = arr[i];
            k++;
        }
        display(ans);
    }
    public static void rotate2(int[] arr, int r) {
        r%=arr.length;
        r = r<0?r+arr.length:r;
        reverse(arr,0,r-1);                //reverse(arr,0,n-r-1);
        reverse(arr,r,arr.length-1);       //reverse(arr,n-r,n-1);  
        reverse(arr,0,arr.length-1);       //reverse(arr,0,n-1);
        display(arr);
    } 
    public static void subarrays(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
    public static void subsetsofarray(int[] arr) {
        int limit = (int)Math.pow(2,arr.length);
        
        for(int i=0; i<limit; i++) {
            String set = "";
            int temp = i;
            for(int j=arr.length-1; j>=0; j--) {
                
                int r = temp%2;
                temp/=2;

                if(r==0) {
                    set = "-" + set;
                }
                else {
                    set = arr[j] + set;
                }
            }
            System.out.println(set);
        }
    }
}