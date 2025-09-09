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
    public ListNode sortList(ListNode head) {
    //     if(head==null||head.next==null)return head;
       
    //    for(ListNode i=head;i!=null;i=i.next)
    //    {
    //     for(ListNode j=i.next;j!=null;j=j.next)
    //     {
    //         if(i.val>j.val)
    //         {
    //             int temp=i.val;
    //             i.val=j.val;
    //             j.val=temp;
    //         }
    //     }
    //    }
    //    return head;
     if (head == null || head.next == null) return head;

        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        for (int step = 1; step < length; step <<= 1) {
            ListNode prev = dummy;
            ListNode curr = dummy.next;

            while (curr != null) {
                ListNode left = curr;
                ListNode right = split(left, step); 
                curr = split(right, step);          
                prev.next = merge(left, right);
                while (prev.next != null) {
                    prev = prev.next;
                }
            }
        }
        return dummy.next;
    }
    private ListNode split(ListNode head, int n) {
        while (n > 1 && head != null) {
            head = head.next;
            n--;
        }
        if (head == null) return null;
        ListNode second = head.next;
        head.next = null;
        return second;
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0), tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;
        return dummy.next;
    }
}