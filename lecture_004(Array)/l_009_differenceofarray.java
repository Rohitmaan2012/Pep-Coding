import java.util.Scanner;
public class l_009_differenceofarray {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
    	int n2 = scn.nextInt();
    	int[] a2 = new int[n2];
    	input2(a2);
    	int n1 = scn.nextInt();
    	int[] a1 = new int[n1];
    	input1(a1);
    	int[] diff = new int[n2];
    	subtraction(a2,a1,diff);
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
    public static void subtraction(int[] a2, int[] a1, int[] diff) {
    	int c= 0;
    	int j = a2.length-1;
    	int i = a1.length-1;
    	int k = diff.length-1;
        
    	while(k>=0) {
    		int d = 0;
            int v = i>=0?a1[i]:0;
			//System.out.println(j); for debugging
            /*if (i>=0) {
                a1[i] = a1[i];
            }
            else {
                a1[i] = 0;
            } */
	    	if(a2[j]+c>=v) {
	    		d = a2[j]+c-v;
				c=0;
	    	}
	    	else {
	    	    d = a2[j]+c+10-v;
				c=-1;
            }
	    	diff[k] = d;
	    	i--;
	    	j--;
	    	k--;
	    }
		int kv = 0;
		while(kv<diff.length) {
			if(diff[kv]==0) {
				//System.out.print("");
				kv++;
			}
			/* (this is wrong)
			else {
				System.out.print(diff[kv]+" ");
				kv++;
			}
			*/
			else {
				break;
			}
    	}
    	while(kv<diff.length) {
        	System.out.print(diff[kv]+" ");
        	kv++;
		}
	}
}