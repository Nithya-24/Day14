package linkedList;

public class LinkedList {

/**
* addNode - this method is created to add data to linedList
*
* @param head - accepting head pointer of LinkedList to manipulate it
* @param data - accepting data to put it in linkedList
* @return head - it returns head of linkedList
*
*/
	public Node addNode(Node head, int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node pointer = head;

			while (pointer.next != null) {
				pointer = pointer.next;
			}

			pointer.next = newNode;
		}

	return head;
	}

	public void printLinkedList(Node head){
	if (head == null) {
	System.out.println("LinkedList is empty");
	} else {
	Node pointer = head;
	while (pointer != null) {
	System.out.print(pointer.data + " ");
	pointer = pointer.next;
		}
	}
	
	}
	
	/**public static Node addTwoLists(Node first, Node second) {
		  Node start1 = new Node(0);
		  start1.next = first;
		  Node start2 = new Node(0);
		  start2.next = second;
		  addPrecedingZeros(start1, start2);
		  Node result = new Node(0);
		  if (sumTwoNodes(start1.next, start2.next, result) == 1) {
		    Node dummy = new Node(1);
		    dummy.next = result.next;
		    result.next = dummy;
		  }
		  return result.next;
		}*/
		public static int sumTwoNodes(Node head, Node data, Node result) {
		  if (head == null) {
		    return 0;
		  }
		  int sum = 0;
		  sum += head.data;
		  sum += data.data;
		  sum += sumTwoNodes(head.next, data.next, result);
		  Node dummy = new Node(sum % 10);
		  dummy.next = result.next;
		  result.next = dummy;
		  return sum / 10;
		}
		public static void addPrecedingZeros(Node start1, Node start2) {
		  Node next1 = start1.next;
		  Node next2 = start2.next;
		  while (next1 != null && next2 != null) {
		    next1 = next1.next;
		    next2 = next2.next;
		  }
		  if (next1 == null) {
		    if (next2 != null) {
		      while (next2 != null) {
		        Node dummy = new Node(0);
		        dummy.next = start1.next;
		        start1.next = dummy;
		        next2 = next2.next;
		      }
		    }
		  } else if (next2 == null) {
		    if (next1 != null) {
		      while (next1 != null) {
		        Node dummy = new Node(0);
		        dummy.next = start2.next;
		        start2.next = dummy;
		        next1 = next1.next;
		      }
		    }
		  }
		}
		public static Node solve(Node head, Node data) {
		  Node result = addTwoLists(head, data);
		  return result;
		}

		private static Node addTwoLists(Node head, Node data) {
			
			return null;
		}
		
}