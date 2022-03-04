package linkedList;

public class LinkedList {

public Node head = null;
public Node tail = null;

/**
* addNode - this method is created to add data to linedList
*
* @param head - accepting head pointer of LinkedList to manipulate it
* @param data - accepting data to put it in linkedList
* @return head - it returns head of linkedList
*
*/
	public Node addNode(int data) {  
	  
    Node newNode = new Node(data);  
     if(head == null) {  
        //If list is empty, both head and tail will point to new node  
        head = newNode;  
        tail = newNode;  
    }  
    else {  
        //newNode will be added after tail such that tail's next will point to newNode  
        tail.next = newNode;  
        //newNode will become new tail of the list  
        tail = newNode;  
    }
	return newNode;  
     
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
	
		
		
		/**
		 * Delete the Node from Start of the Linked List
		 * @param head
		 * @return
		 */
		public Node deleteNodeFromStart(Node head) {
			System.out.println("Deleted node from start : " + head.data);
			head = head.next;
			return head;
			}
		
		public void deleteNodeFromEnd(Node head) {
			Node pointer = head;
			Node prev = null;

			while (pointer.next != null) {
			prev = pointer;
			pointer = pointer.next;
			}
			System.out.println("Deleted node from end : " + pointer.data);
			prev.next = null;
			}
		
		/**
		 * search the Node of LinkedList
		 * @param key
		 */
		public void searchOfNode(int key) {
			
			  Node current = head;  
		        int i = 1;  
		        boolean flag = false;  
		        //Checks whether list is empty  
		        if(head == null) {  
		            System.out.println("List is empty");  
		        }  
		        else {  
		            while(current != null) {  
		                 //Compares node to be found with each node present in the list  
		                if(current.data == key) {  
		                    flag = true;  
		                    break;  
		                }  
		                i++;  
		                current = current.next;  
		            }  
		        }  
		        if(flag)  
		             System.out.println("Element is present in the list at the position : " + i);  
		        else  
		             System.out.println("Element is not present in the list");  
		    }
		
				  
		
		
}