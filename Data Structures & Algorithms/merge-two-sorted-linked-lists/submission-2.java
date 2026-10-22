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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(list1!=null&&list2!=null)
        {
            int l1=list1.val;
            int l2=list2.val;
            if(l1<=l2)
            {
                temp.next=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null)
        {
            temp.next=list1;
        }
        else
        {
            temp.next=list2;
        }
        return head.next;
    }
}