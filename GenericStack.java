package q1;

import java.util.*;

public class GenericStack<T> {

	Node head;

	GenericStack() {
		head = null;
	}

	GenericStack(Node h) {
		head = h;
	}

	public void push(T item) {
		try {

			if (item == null) {
				throw new ExceptionHandling();
			}
			if (head == null) {
				head = new Node();
				head.element = item;

			} else {
				Node temp = head;
				head = new Node(item);
				head.next = temp;

			}
		} catch (ExceptionHandling e) {
			e.NullPointerException();
		}
	}

	void pop() {
 
		try {
			if (this.isEmpty() == true) {
				throw new ExceptionHandling();
			}

			if (head.next == null) {
				System.out.println("popped:" + head.element);

				head = null;

			} else {
				System.out.println("popped:" + head.element);

				head = head.next;

			}
		} catch (ExceptionHandling e) {
			e.EmptyStackException();
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	public int size() {
		System.out.println("Calculating size using temp stack :");
     
		// stack can not be printed as a whole
		// using pop and push
		GenericStack<T> temp = new GenericStack<T>();

		if (head == null) {
			return 0;
		} else {

			int count = 0;
			System.out.println("          temp stack        :");

			while (!isEmpty()) {
				temp.push((T) head.element);
				pop();
				count++;

			}
			System.out.println("           Main stack        :");

			while (!temp.isEmpty()) {
				push((T) temp.head.element);
				temp.pop();
 
			}
			System.out.println("\n\n\n");

			return count;
		}
		
	}

	 
}
