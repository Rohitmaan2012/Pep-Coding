public class l_001_addlastinlinkedlist {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if(size==0) {
                head = tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
    }
}