package Course.BinaryTree.practiceOwn;

import java.util.Scanner;

public class Tree {

	static Scanner sc;
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		Node node = createTree();
		System.out.println("node :: "+node);
	}
	
	public static Node createTree() {
		Node root = null;
		System.out.println("Enter data :: ");
		int data = sc.nextInt();
		
		if(data == -1) {
			return null;
		}
		root = new Node(data);
		
		System.out.println("Enter left data :: "+data);
		root.left = createTree();
		
		System.out.println("Enter right data :: "+data);
		root.right = createTree();
		
		return root;
	}

}

class Node {
	Node left;
	Node right;
	int data;
	
	Node(int data){
		this.data = data;
	}
}
