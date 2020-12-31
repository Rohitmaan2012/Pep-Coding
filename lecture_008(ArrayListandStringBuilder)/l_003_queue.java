import java.util.Scanner;
import java.util.ArrayDeque;

public class l_003_queue {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayDeque<Integer> que = new ArrayDeque<>();
        solution(que);
    }
    public static void solution(ArrayDeque<Integer> que) {
        que.addLast(10);
        que.addLast(20);       //Queue
        que.addLast(30);
        System.out.println(que);

        que.addFirst(5);
        System.out.println(que);

        System.out.println(que.getLast());

        System.out.println(que.getFirst());

        System.out.println(que.removeLast());
        System.out.println(que);

        que.removeFirst();     //Queue
        System.out.println(que);
    }
}