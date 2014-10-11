package leetcode.oj;

public class LinkedListCycleII {
	class ListNode {
		    int val;
		    ListNode next;
		    ListNode(int x) {
		    	val = x;
		    	next = null;
		}
	}
	
	public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        if(head.next==head) return head;//exclude situation:{1}, tail connects to node index 0
        if(head.next.next==head) return head;//exclude situation:{1,2}, tail connects to node index 0
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&slow!=null){
            fast=fast.next;
            if(fast!=null) fast=fast.next;
            slow=slow.next;
            if(slow==fast) {//exsit cycle
                slow=head;
                while(slow!=fast){
                    fast=fast.next;
                    slow=slow.next;
                    if(slow==fast) return slow;
                }//end inner while
            }
        }//end outer while
        return null;
    }
}
