import java.io.*;
import java.util.*;

public class l_012_linkedlisttoqueueadapter {
    public static class LLToQueueAdapter {
        LinkedList<Integer> list;

        public LLToQueueAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addLast(val);
        }

        int pop() {
            if(size()==0) {
                System.out.println("Queue underflow");
                return -1;
            }
            else {
                return list.removeFirst();
            }
        }

        int top() {
            if(size()==0) {
                System.out.println("Queue underflow");
                return -1;
            }
            else {
                return list.getFirst();
            }
        }
    }

    public static void main(String[] args) {
        LLToQueueAdapter ans = new LLToQueueAdapter();
    }
}