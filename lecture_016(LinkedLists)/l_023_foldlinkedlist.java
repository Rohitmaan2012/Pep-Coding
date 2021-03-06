public class l_023_foldlinkedlist {
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

		//----------------Recursion----------------//
		private void foldHelper(Node right, int floor) {
            if(right == null) {
                return;
            }
            foldHelper(right.next, floor+1);
            if(floor>size/2) {
				Node temp = left.next;
				left.next = right;
				right.next = temp;
				left = temp;
			}
			else if(floor==size/2) {
				tail = right;
				tail.next = null;
			}
        }
        Node left;
        public void fold() {
            left = head;
            foldHelper(head,0);
        }
        //---------------Brute Force------------//
        // public ListNode midNode(ListNode head) {
        //     if(head==null || head.next == null) {
        //         return head;
        //     }
        //     ListNode f = head;
        //     ListNode s = head;
        //     while(f.next != null && f.next.next != null) {
        //         f = f.next.next;
        //         s = s.next;
        //     }
        //     return s;
        // }
        // public ListNode reverseLL(ListNode head) {
        //     if(head == null || head.next == null) {
        //         return head;
        //     }
        //     ListNode prev = null, curr = head;
        //     while(curr != null) {
        //         ListNode next = curr.next;
        //         curr.next = prev;
        //         prev = curr;
        //         curr = next;
        //     }
        //     return prev;
        // }
        // public void reorderList(ListNode head) {
        //     if(head == null || head.next == null) {
        //         return;
        //     }
        //     ListNode mid = midNode(head);
        //     ListNode nHead = mid.next;
        //     mid.next = null;
            
        //     nHead = reverseLL(nHead);
            
        //     ListNode c1 = head, c2 = nHead, f1 = null, f2 = null;
        //     while(c2 != null) {
        //         f1 = c1.next;
        //         f2 = c2.next;
                
        //         c1.next = c2;
        //         c2.next = f1;
                
        //         c1 = f1;
        //         c2 = f2;
        //     }  
        // }
    }
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addLast(6);
		System.out.println(list.size());
		list.display();
		list.removeFirst();
		list.display();
		System.out.println(list.getAtIndex(1));	
		list.addFirst(2);
		list.display();
		list.addAtIndex(2, 7);
		list.display();
		list.removeLast();
		list.display();
		list.removeAtIndex(2);
		list.display();
        list.fold();
        list.display();
	}
}