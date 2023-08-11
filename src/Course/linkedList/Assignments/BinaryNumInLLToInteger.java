package Course.linkedList.Assignments;

 class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

public class BinaryNumInLLToInteger {

	public static void main(String[] args) {
		int res = getDecimalFromBinary("101");
	}
	
	
    public int getDecimalValue(ListNode head) {
    	if(null == head)
            return -1;
        
        ListNode currNode = head;
        StringBuilder nodeContent = new StringBuilder();
        
        while(currNode != null){
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
           // System.out.println("pw2 :: "+pow2+"     num :: "+num+"    res :: "+res+"      binaryNum.charAt(i) :: "+binaryNum.charAt(i));
            
            decimalNum = decimalNum + res;
            pow++;
		}
		
		return (int)decimalNum;
	}

}
