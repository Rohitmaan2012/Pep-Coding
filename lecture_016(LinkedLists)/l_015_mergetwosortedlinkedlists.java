public class l_015_mergetwosortedlinkedlists {
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
		
		public int size() {
			return size;
		}
		
		public void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next; 
			}
			System.out.println();
		}
		
		public void removeFirst() {
            if(size==0) {
                System.out.println("List is empty");
            }
            else if(size==1) {
                head = tail = null;
                size = 0;
            }
            else {
            	head = head.next;
            	size--;
            }
		}
		
		public int getFirst() {
			if(size==0) {
				System.out.println("List is empty");
				return -1;
			}
			else {
				return head.data;
			}
		}
		
		public int getLast() {
			if(size==0) {
				System.out.println("List is empty");
				return -1;
			}
			else {
				return tail.data; 
			}
		}
		
		public int getAtIndex(int idx) {
			if(size==0) {
				System.out.println("List is empty");
				return -1;
			}
			else if(idx<0 || idx>=size) {
				System.out.println("Invalid arguments");
				return -1;
			}
			else {
				Node temp = head;
				for(int i=0; i<idx; i++) {
					temp = temp.next;
				}
				return temp.data; 
			}
		}
		
		public void addFirst(int val) {
			Node temp = new Node();
			temp.data = val;
			temp.next = head;
			if(size==0) {
				head = tail = temp;
			}
			else {
				head = temp;		
			}
			size++;
		}
		
		public void addAtIndex(int idx, int val) {
			if(idx==0) {
				addFirst(val);
			}
			else if(idx==size) {
				addLast(val);
			}
			else if(idx<0 || idx>size) {
				System.out.println("Invalid arguments");
			}
			else {
				Node node = new Node();
				node.data = val;
				Node temp = head;
				for(int i=0; i<idx-1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
				size++;
			}
		}
		
		public void removeLast() {
            if(size==0) {
                System.out.println("List is empty");
            }
            else if(size==1) {
                head = tail = null; 
                size = 0;
            }
            else {
            	Node temp = head;
            	for(int i=0; i<size-2; i++) {
            		temp = temp.next;
            	}
            	temp.next = null;
            	tail = temp;
            	size--;
            }
		}
		
		public void removeAtIndex(int idx) {
			if(idx==0) {
				removeFirst();
			}
			else if(idx==size-1) {
				removeLast();
			}
			else if(idx<0 || idx>=size) {
				System.out.println("Invalid arguments");
			}
			else {
				Node temp = head;
				for(int i=0; i<idx-1; i++) {
					temp = temp.next; 
				}
				temp.next = temp.next.next;
				size--;
			}
		}
		
		public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;
            LinkedList res = new LinkedList();
            while(one != null && two != null) {
                if(one.data<two.data) {
                    res.addLast(one.data);
                    one = one.next;
                }
                else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }
            while(one != null) {
                res.addLast(one.data);
                one = one.next;
            }
            while(two != null) {
                res.addLast(two.data);
                two = two.next;
            }
            return res;
        }
	}
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addLast(3);
		list1.addLast(4);
		list1.addLast(5);
		list1.addLast(6);
		list1.display();
        LinkedList list2 = new LinkedList();
        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(6);
        list2.addLast(8);
		list2.display();
        LinkedList list = new LinkedList();
        list = list.mergeTwoSortedLists(list1,list2);
        list.display();
	}
}