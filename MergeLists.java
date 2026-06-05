class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class MergeLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        
        ListNode mergedHead = mergeTwoLists(l1, l2);
        printList(mergedHead); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    }
    
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list3=new ListNode();
        ListNode head=list3;
        while(l1!=null && l2!=null ){
            if(l1.val<=l2.val){
                head.next=l1;
                l1=l1.next;
            }
            else{
                head.next=l2;
                l2=l2.next;
            }
            head=head.next;
        }
        if(l1!=null){
            head.next=l1;
        }
        else{
            head.next=l2;
        }
        return list3.next;
    }
    
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}