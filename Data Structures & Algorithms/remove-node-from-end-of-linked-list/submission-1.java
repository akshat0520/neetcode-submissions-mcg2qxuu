/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null)
        {
            return null;
        }
        int c=1;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            c++;
            fast=fast.next.next;
        }
        int len=0;
        if(fast==null)
        {
            c=c-1;
            len=2*c;
        }
        else
        {
            len=(2*c)-1;
        }
        int n1=len-n+1;
        slow=dummy;
        for(int i=1;i<n1;i++)
        {
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
