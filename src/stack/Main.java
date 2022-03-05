package stack;

public class Main {
	public static void main(String[] args) {
			
			Stack list = new Stack();
			
			/**
			 * pushing my Element to the Stack
			 */
			list.push(70);
			list.push(30);
			list.push(56);
			
			/**
			 * peak and Pop from my Stack until my Stack is empty
			 */
			list.peak();
			list.pop();
			list.peak();
			list.pop();
			list.peak();
			list.pop();
			list.peak();
			list.printList();
		}
	}