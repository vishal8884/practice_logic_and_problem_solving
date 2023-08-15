package Course.linkedList.Assignments;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;

	}
	
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
}


class LinkedListImppl {
	ListNode head;
	
	public void insert(int data) {
		ListNode node = new ListNode();
		node.val = data;
		node.next = null;
		
		while(head != null) {
			head = head.next;
		}
		
		head.next = node;
	}
}

public class BinaryNumInLLToInteger {

	public static void main(String[] args) {
		// int res = getDecimalFromBinary("101");
		LinkedListImppl ll = new LinkedListImppl();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		
		reverseList(ll.head);
	}

	public static ListNode reverseList(ListNode head) {
		ListNode prevHead = null;
		while (head != null) {
			ListNode recordNext = head.next;
			head.next = prevHead;
			prevHead = head;
			head = recordNext;
		}
		return prevHead;
	}

	public int getDecimalValue(ListNode head) {
		if (null == head)
			return -1;

		ListNode currNode = head;
		StringBuilder nodeContent = new StringBuilder();

		while (currNode != null) {
			nodeContent.append(currNode.val);
			currNode = currNode.next;
		}

		return getDecimalFromBinary(nodeContent.toString());
	}

	public static int getDecimalFromBinary(String binaryNum) {
		int pow = 0;
		double decimalNum = 0;
		for (int i = binaryNum.length() - 1; i >= 0; i--) {
			double pow2 = Math.pow(2, pow);
			double num = Double.valueOf(Character.toString(binaryNum.charAt(i)));
			double res = pow2 * num;
			// System.out.println("pw2 :: "+pow2+" num :: "+num+" res :: "+res+"
			// binaryNum.charAt(i) :: "+binaryNum.charAt(i));

			decimalNum = decimalNum + res;
			pow++;
		}

		return (int) decimalNum;
	}

}
