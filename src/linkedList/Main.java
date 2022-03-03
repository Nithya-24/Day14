package linkedList;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		* PROCEDURE
		* 1. Creating Linked list
		* 2. Adding nodes to linkedList
		* 3. Printing linedList after adding nodes
		* 4. Deleting node from start of the linkedlist
		* 5. Printing linedList after deleting node from start of the linkedlist
		* 6. Deleting node from end of the linkedlist
		* 7. Printing linedList after deleting node from end of the linkedlist
		*/

		/*
		* 1. Creating Lined list
		*/
		LinkedList list = new LinkedList();

		/*
		* 2. Adding nodes to linkedList
		*/
		Node head = list.addNode(null, 56);
		list.addNode(head, 30);
		list.addNode(head, 30);
		list.addNode(head, 70);
		
		/*
		* 3. Printing linedList after adding nodes
		*/
		list.printLinkedList(head);
		System.out.println();
		
		head = list.deleteNodeFromStart(head);

		/*
		*Printing likedList after deleting node from start of the linkedlist
		*/
		list.printLinkedList(head);
		System.out.println();

		
	   
	    

	}
	
}
