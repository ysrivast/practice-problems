package ds;

import ds.BinaryTree.Node;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(1);
		System.out.println("Binary Tree Example");
		System.out.println("Building tree with root value ");
		tree.insert(root, 1);
		tree.insert(root, 2);
		tree.insert(root, 3);
		tree.insert(root, 4);
		tree.insert(root, 5);
        tree.insert(root, 6);
        tree.insert(root, 9);
		System.out.println("Traversing tree in order");
		tree.traverseInOrder(root);
		System.out.println();
		tree.traversPreOrder(root);
		System.out.println();
		tree.traversPostOrder(root);
//		checkMirror

//		BinaryTree tree1 = new BinaryTree();
//		BinaryTree tree2 = new BinaryTree();
//		Node root1 = new Node(1);
//		tree1.root = root1;
//		tree1.insert(tree1.root, 2);
//		tree2.insert(tree2.root, 2);
//		tree2.root = root1;
//		System.out.println(tree1.checkMirror(root1, root1));
	}
}

class BinaryTree {

	Node root;

	static class Node {
		Integer data;
		Node left, right;

		public Node(Integer data) {
			this.data = data;
		}
	}
	public void insert(int value) {
		
	}

	public void insert(Node node, int value) {
		if (value < node.data) {
			if (node.left != null) {
				insert(node.left, value);
			} else {
				node.left = new Node(value);
			}
		} else if (value > node.data) {
			if (node.right != null) {
				insert(node.right, value);
			} else {
				node.right = new Node(value);
			}
		}
	}

	public void traverseInOrder(Node node) {
		if (node == null)
			return;
		traverseInOrder(node.left);
		System.out.print(node.data + " ");
		traverseInOrder(node.right);
	}

	public void traversPreOrder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			traversPreOrder(node.left);
			traversPreOrder(node.right);
		}
	}

	public void traversPostOrder(Node node) {
		if (node != null) {
			traversPostOrder(node.left);
			traversPostOrder(node.right);
			System.out.print(node.data + " ");
		}
	}

	public static boolean checkMirror(Node node1, Node node2) {
		if (node1 == null && node2 == null) {
			return true;
		}
		if (node1 != null && node2 != null && node1.data == node2.data) {
			return (checkMirror(node1.left, node2.right) && checkMirror(node1.right, node2.left));
		}
		return false;
	}

	public Node mirror() {
		return mirror(this.root);
	}

	private Node mirror(Node root) {

		if (root == null) {
			return null;
		}
		Node node = new Node(this.root.data);
		node.left = mirror(node.right);
		node.right = mirror(node.left);

		return node;

	}
}
