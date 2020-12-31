import java.util.Scanner;
public class l_014_ceilandfloor {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int data = scn.nextInt();
        //System.out.println(binarySearch(arr,data));
        upperAndLowerBound(arr,data);
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
    public static boolean binarySearch(int[] arr, int data) {
        int l = 0;
        int h = arr.length-1;
    
        while(l<=h) {
            int m = (l+h)/2;
            if(data<arr[m]) {
                h = m-1;
            }
            else if(data>arr[m]) {
                l=m+1;
            }
            else {
                System.out.println(m);
                return true;
            }
        } 
        return false;            
    }
    public static void upperAndLowerBound(int[] arr, int data) {
        int l = 0;
        int h = arr.length-1;
        int ceil = 0;
        int floor = 0;
    
        while(l<=h) {
            int m = (l+h)/2;
            if(data<arr[m]) {
                h = m-1;
                ceil = arr[m];
            }
            else if(data>arr[m]) {
                l = m+1;
                floor = arr[m];
            }
            else {
                ceil = arr[m];
                floor = arr[m];
                break;
            }
        } 
        System.out.println("Ceil: "+ ceil);
        System.out.println("Floor: "+ floor);        
    }     
}