package stack;

public class Stack {
	static Node head;
	public int count = 1;

	/**
	 * push an New element in a stack
	 * Display my Node which is present in peak in Stack
	 * pop an element is stack
	 * 
	 * @param data - data to be added as parameter
	 * @return - return the newNode
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	/**
	 *  popping the top element from the stack
	 * 
	 * @return - new head which is next to the previous head
	 */
	public Node pop () {
		System.out.println("Popped element is " + head.data);
		head = head.next;
		return head;
	}

	/**
	 *  print top element of the stack
	 * 
	 * @return
	 */
	public void peak() {
		if (head != null) {
			System.out.println("Top of the stack is " + head.data);
		} else {
			System.out.println("No element left in the stack.");
			return;
		}
	}

	/**
	 * 
	 * print every current Node starting from head, while
	 * changing to currentNode to nextNode when it print one node.
	 */
	public void printList() {
		if (head == null) {
			System.out.println("Stack is empty.");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}

	}
}


