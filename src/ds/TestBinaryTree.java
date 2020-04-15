package ds;

import ds.BinaryTree.Node;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " );
//        tree.insert(root, 1);
//        tree.insert(root, 2);
//        tree.insert(root, 3);
//        tree.insert(root, 4);
//        tree.insert(root, 5);
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
//        tree.insert(root, 6);
//        tree.insert(root, 9);
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);System.out.println();
        tree.traversPreOrder(root);System.out.println();
        tree.traversPostOrder(root);
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
		if(node==null) 
			return ;
			traverseInOrder(node.left);
			System.out.print(node.data +" ");
			traverseInOrder(node.right);
	}
	
	public void traversPreOrder(Node node) {
		if(node!=null) {
			System.out.print(node.data+" ");
			traversPreOrder(node.left);
			traversPreOrder(node.right);
		}
	}
	public void traversPostOrder(Node node) {
		if(node!=null) {
			traversPostOrder(node.left);
			traversPostOrder(node.right);
			System.out.print(node.data+" ");
		}
	}
}
