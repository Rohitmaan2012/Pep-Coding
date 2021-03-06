import java.util.Scanner;
public class l_015_firstandlastindex {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int data = scn.nextInt();
        //System.out.println(binarySearch(arr,data));
        firstIndex(arr,data);
        lastIndex(arr,data);
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
                l = m+1;
            }
            else {
                System.out.println(m);
                return true;
            }
        } 
        return false;            
    }
    public static void lastIndex(int[] arr, int data) {
        int l = 0;
        int h = arr.length-1;
        int li = 0;
    
        while(l<=h) {
            int m = (l+h)/2;
            if(data<arr[m]) {
                h = m-1;
            }
            else if(data>arr[m]) {
                l = m+1;
            }
            else {
                li = m;
                l = m+1;
            }
        } 
        System.out.println("Last: "+li);          
    }
    public static void firstIndex(int[] arr, int data) {
        int l = 0;
        int h = arr.length-1;
        int fi = 0;
    
        while(l<=h) {
            int m = (l+h)/2;
            if(data<arr[m]) {
                h = m-1;
            }
            else if(data>arr[m]) {
                l = m+1;
            }
            else {
                fi = m;
                h = m-1;
            }
        } 
        System.out.println("First: "+fi);          
    }
}