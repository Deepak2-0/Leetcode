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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        int carry = 0;
        int i1=0,i2=0;
        
        while(l1 != null || l2 != null ){
            if(l1!=null){
                 i1 = l1.val;
            }
            else i1 =0;
            if(l2!=null){
                 i2 = l2.val;
            }
            else i2 =0;
            int sum = i1+i2+carry;
            head.next = new ListNode(sum%10);
            if(sum>9) carry=1;
            else carry=0;
            
            head = head.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            
        }
        if(carry==1){
            head.next  = new ListNode(carry);
        }
        return temp.next;
        
    }
}