import java.util.Scanner;
public class l_007_shellrotate {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[n][m];
		input(arr);
		int s = scn.nextInt();
		int r = scn.nextInt();
		shellRotate(arr,s,r);
		display(arr);
	}
	public static void display(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void input(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
	}
	public static void reverse(int[] oned, int si, int ei) {
		while(si<ei) {
			int temp = oned[si];
			oned[si] = oned[ei];
			oned[ei] = temp;
			si++;
			ei--;
		}
	}
	public static int[] fillonedfromshell(int[][] arr, int s) {
		int minr = s-1;
		int minc = s-1;
		int maxr = arr.length-s;
		int maxc = arr[0].length-s;
	     /*size = (lw + bw + rw + tw)-4;
		   = [(maxr-minr+1)+(maxc-minc+1)+(maxr-minr+1)+(maxc-minc+1)]-4; 
           = [2(maxr-minr+1)+2(maxc-minc+1)]-4;
           = 2maxr-2minr+ 2 +2maxc-2minc+ 2 - 4;
           = 2(maxr-minr+maxc-minc); */		 
		int size = 2 * (maxr-minr + maxc-minc);
		int idx =0;
		int[] oned = new int[size];
		 
		for(int i=minr,j=minc; i<=maxr; i++) {
			oned[idx] = arr[i][j];
			idx++;
		}
		minc++;
		 
		for(int j=minc,i=maxr; j<=maxc; j++) {
			oned[idx] = arr[i][j];
			idx++;
		}
		maxr--;
		 
		for(int i=maxr,j=maxc; i>=minr; i--) {
			oned[idx] = arr[i][j];
			idx++;
		}
		maxc--;
		 
		for(int j=maxc,i=minr; j>=minc; j--) {
			oned[idx] = arr[i][j];
			idx++;
		}
		minr++;
		 
		return oned;
	}
	public static void rotate(int[] oned, int r) {
		r %= oned.length;
		r = r<0?r+oned.length:r;
		 
		reverse(oned,0,r-1);          
	    reverse(oned,r,oned.length-1);       
	    reverse(oned,0,oned.length-1);  
	}
	 
	public static void fillshellwithoned(int[][] arr, int s, int[] oned) {
		int minr = s-1;
		int minc = s-1;
		int maxr = arr.length-s;
		int maxc = arr[0].length-s;
		 
		int idx = 0;
		for(int i=minr,j=minc; i<=maxr; i++) {
			arr[i][j] = oned[idx];
			idx++;
		}
		minc++;
		 
		for(int j=minc,i=maxr; j<=maxc; j++) {
			arr[i][j] = oned[idx];
			idx++;
		}
		maxr--;
		 
		for(int i=maxr,j=maxc; i>=minr; i--) {
			arr[i][j] = oned[idx];
			idx++;
		}
		maxc--;
		 
		for(int j=maxc,i=minr; j>=minc; j--) {
			arr[i][j] = oned[idx];
			idx++;
		}
		minr++;
	}
	public static void shellRotate(int[][] arr, int s, int r) {
		int[] oned = fillonedfromshell(arr,s);
		rotate(oned,r);
		fillshellwithoned(arr,s,oned);
	}
}