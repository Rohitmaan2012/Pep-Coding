import java.util.Scanner;
public class l_009_compressastring {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = scn.nextLine();
        //compress1(s);
        compress2(s);
    }
    public static void compress1(String s) {
        int count = 1;
        for(int i=0; i<s.length()-1; i++) {
            char r1 = s.charAt(i);
            char r2 = s.charAt(i+1);
            if(r1 != r2) {
                System.out.print(r1);
                if(count>1) {
                    System.out.print(count); 
                }
                count=1;
            }
            else {
                count++;
            }
        }
        System.out.print(s.charAt(s.length()-1));
        if(count>1) {
            System.out.print(count);
        }
    }
    public static String compress2(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i=0; i<s.length()-1; i++) {
			char r1 = s.charAt(i);
			char r2 = s.charAt(i+1);
			if(r1 != r2) {
				sb.append(r1);
				sb.append(count);
				count=0;
			}
			count++;
		}
		sb.append(s.charAt(s.length()-1));
		sb.append(count);
		return sb.toString();
	}
}