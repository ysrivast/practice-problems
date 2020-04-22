package ds;

public class TestStack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		System.out.println(stack.isEmpty());
		stack.push(1);
		System.out.println(stack.isEmpty());
		stack.push(21);
		stack.push(212);
		stack.push(2122);
		stack.print();
		stack.pop();
		stack.print();
		System.out.println(stack.peek());
		stack.print();
	}

}

class MyStack {
	Node root;

	static class Node {
		Integer data;
		Node next;

		public Node(Integer data) {
			this.data = data;
		}
	}

	public void push(Integer obj) {
		Node node = new Node(obj);
		if (this.root == null) {
			this.root = node;
		} else {
			Node temp = this.root;
			this.root = node;
			node.next = temp;
		}
	}

	public void pop() {
		if (root == null) {

		} else {
			this.root = this.root.next;
		}
	}

	public Integer peek() {
		Node node=null;
		if (root == null) {
			return null;
		} else {
			node= new Node(root.data);
			this.root = this.root.next;
		}
		return node.data;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public void print() {
		Node node = this.root;
		System.out.print("Stack: [");
		while (node != null) {
			System.out.print(node.data + ", ");
			node = node.next;
		}
		System.out.print("]" + "\n");
	}
}
