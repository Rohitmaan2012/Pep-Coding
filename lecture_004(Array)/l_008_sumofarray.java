import java.util.Scanner;
public class l_008_sumofarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	int n1 = scn.nextInt();
    	int[] a1 = new int[n1];
    	input1(a1);
    	int n2 = scn.nextInt();
    	int[] a2 = new int[n2];
    	input2(a2);
    	int[] sum = new int[n1>n2?n1:n2];
    	addition(a1,a2,sum);
    }
    public static void display(int[] arr) {
    	for(int r: arr) {
    		System.out.print(r+" ");
    	}
    	System.out.println();
    }
    public static void input1(int[] a1) {
    	for(int i=0; i<a1.length; i++) {
    		a1[i]=scn.nextInt();
    	}
    }
    public static void input2(int[] a2) {
    	for(int j=0; j<a2.length; j++) {
    		a2[j]=scn.nextInt();
    	}
    }
    public static void addition(int[] a1, int[] a2, int[] sum) {
    	int c= 0;
    	int i = a1.length-1;
    	int j = a2.length-1;
    	int k = sum.length-1;
    	
    	while(k>=0) {
    		int d = c;
	    	if(i>=0) {
	    		d = d+a1[i];
	    	}
	    	if(j>=0) {
	    		d = d+a2[j];
	    	}
	    	c = d/10;
	    	d = d%10;
	    	
	    	sum[k] = d;
	    	i--;
	    	j--;
	    	k--;
	    }
	    if(c!=0) {
	    	System.out.print(c+" ");
	    }
	    display(sum);
    }
}