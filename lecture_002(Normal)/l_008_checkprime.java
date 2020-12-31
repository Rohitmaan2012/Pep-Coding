import java.util.Scanner;
public class l_009_checkprime {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scn.nextInt();
        isPrime(n); 
    }
    public static void isPrime(int n) {
        boolean flag = false;    //flag variable is generally used to check condition.
        for(int div=2; div*div<=n; div++) {
            if(n%div == 0) { //not a prime number
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println(n+" is not a prime number");   
            }
        else 
            System.out.println(n+" is a prime number");
    }
}
