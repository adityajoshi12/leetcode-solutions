class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null || l2 == null) return l1!=null?l1:l2;
        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                prev.next=l1;
                l1=l1.next;
            }else{
                prev.next=l2;
                l2=l2.next;
            }
 
            prev=prev.next;
        }
        prev.next=l1!=null?l1:l2;
         return dummy.next;
    }
   
}