class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class RemoveDuplicatesFromSortedListsII {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        
        ListNode resultHead = deleteDuplicates(head);
        printList(resultHead); // Output: 1 -> 2 -> 5
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        if(head.val==head.next.val){
            while(head!=null && head.val==head.next.val){
                head=head.next;
            }
            return deleteDuplicates(head);
        }
        else{
            head.next=deleteDuplicates(head.next);
            return head;
        }
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}