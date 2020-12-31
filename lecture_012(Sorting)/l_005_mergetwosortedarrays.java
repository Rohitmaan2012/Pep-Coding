import java.util.Scanner;
public class l_005_mergetwosortedarrays {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int[] one = new int[n1];
        input(one);
        int n2 = scn.nextInt();
        int[] two = new int[n2];
        input(two);;
        int[] arr = new int[one.length+two.length];
        display(mergeTwoSortedArrays(arr,one,two));
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
    public static int[] mergeTwoSortedArrays(int[] arr, int[] one, int[] two) {
        int i=0;
        int j=0;
        int k=0;
        while(i<one.length && j<two.length) {
            if(one[i]>two[j]) { 
                arr[k] = two[j];
                j++; 
                k++;
            }
            else if(one[i]<two[j]) {
                arr[k] = one[i];
                i++;
                k++;
            }
        }
        while(i<one.length) {
            arr[k] = one[i];
            i++;
            k++;
        }
        while(j<two.length) {
            arr[k] = two[j];
            j++;
            k++;
        }
        return arr;
    }
}


