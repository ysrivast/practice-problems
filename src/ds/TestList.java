package ds;

public class TestList {

	public static void main(String[] args) {

		MyList list = new MyList();
		list.add(1);
		list.add(21);
		list.add(12);
		list.add(22);
		list.add(2);
		list.print();
//		System.out.println(list.size());
//		list.delete(221);
//		list.print();
//		System.out.println(list.size());
//		list.print();
//		list.cycle();
//		list.print();
//		System.out.println(list.hasCycle());
		list.head=list.reverse(list.head,2);
		list.print();
//		System.out.println(list.middle());
	}
}

class MyList {
	 Node head;
	private int size;

	static class Node {
		Integer data;
		Node next;

		public Node(Integer data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(Integer obj) {

		Node _node = new Node(obj);

		if (this.head == null) {
			this.head = _node;
		} else {
			Node last = this.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = _node;
		}
		size++;
	}

	public Node reverse(Node node , int k) {
		Node current = this.head, next = null, prev = null;
		int count = 0;
		while (current != null && count++ < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public int middle() {
		Node slow = this.head, fast = this.head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public void cycle() {
		this.head.next.next.next.next = this.head;

	}

	public void print() {

		Node _node = this.head;
		if (_node == null) {
			System.out.println("Initialize list ...");
		} else {
			System.out.print("LinkedList: [");
			while (_node != null) {
				System.out.print(_node.data + ", ");
				_node = _node.next;
			}
			System.out.print("]");
		}
	}

	public int size() {
		return size;
	}

	public boolean delete(Integer obj) {
		Node node = this.head;
		Node prev = null;
		if (node != null && node.data.equals(obj)) {
			this.head = node.next;
			this.size--;
			return true;
		}

		while (node != null && node.data != obj) {
			prev = node;
			node = node.next;
		}
		if (node != null) {
			prev.next = node.next;
			this.size--;
			return true;
		}
		System.out.println("Item not found");
		return false;

	}

	public boolean isEmpty() {
		return false;

	}

	public void reverse() {
		Node currNode = this.head;
		Node prev = null, next = null;
		while (currNode != null) {
			next = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = next;
		}
		this.head = prev;
	}

	public boolean hasCycle() {
		Node curr = this.head;
		// Approach 1
//		Set<Integer> set = new HashSet<Integer>();
//		while(curr!=null) {
//			if(set.contains(curr.data)) 
//				set.add(curr.data);
//			curr = curr.next;
//		}

		// approach2
		Node slow = this.head, fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}

		return false;
	}

}
