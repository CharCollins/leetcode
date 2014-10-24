/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,slow=head;
        if(head==null) return null;
        for(int i=0;i<n&&fast!=null;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){//judge fast next that we don't need to use pre node to mark the node before slow node
            slow=slow.next;//fast isn't empty that slow can't be empty
            fast=fast.next;
        }
        //delete slow
        slow.next=slow.next.next;
        return head;
    }
}
