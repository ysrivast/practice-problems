package ds;

public class TestQueue {

	public static void main(String[] args) {
		MyQueue stack = new MyQueue();
//		System.out.println(stack.isEmpty());
		stack.add(1);
//		System.out.println(stack.isEmpty());
		stack.add(21);
		stack.add(212);
		stack.add(2122);
		stack.print();
		stack.peek();
		stack.print();
	}
}

class MyQueue {
	Node front, rear;

	static class Node {
		Integer data;
		Node next;

		public Node(Integer data) {
			this.data = data;
		}
	}

	public void add(Integer obj) {
		Node node = new Node(obj);
		if (this.front == null) {
			this.front = node;
			this.rear = this.front;
		} else {
			while (rear.next != null) {
				rear = rear.next;
			}
			rear.next = node;
		}

	}

	public void print() {
		Node temp = front;
		System.out.print("Queue: [");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print("]" + "\n");
	}

	public void peek() {
		
		if(front==null) {
			
		}
		else {
			front=front.next;
		}

	}

	public void element() {

	}

	public void remove() {

	}

	public void poll() {

	}

	public void size() {

	}
}