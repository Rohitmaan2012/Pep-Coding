import java.util.Scanner;
import java.util.ArrayDeque;
public class l_020_introductiontoqueue {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayDeque<Integer> que = new ArrayDeque<>();
        que.add(10);
        System.out.println(que);
        que.add(20);
        System.out.println(que);
        que.add(30);
        System.out.println(que);

        System.out.println(que.peek());
        System.out.println(que);

        System.out.println(que.remove());
        System.out.println(que);
    }
}