package Course.BinaryTree;

public class Node {
	
	int data;
	Node left;
	Node right;
	
	public Node(int key) {
		key = data;
	}

	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(5);
	}

}

