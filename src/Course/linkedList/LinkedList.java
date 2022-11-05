package Course.linkedList;

public class LinkedList {

	int val;
	LinkedList next;

	public LinkedList() {

	}

	public LinkedList(int val) {
		this.val = val;
	}
	
	public LinkedList(LinkedList next) {
		this.next = next;
	}
	
	public LinkedList(int val,LinkedList next) {
		this.val = val;
		this.next = next;
	}

}
