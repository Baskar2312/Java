class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class PartitionList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        
        int x = 3;
        ListNode result = partition(head, x);
        printList(result); // Output: 1 -> 2 -> 2 -> 4 -> 3 -> 5
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;
        
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        
        after.next = null; // Important to avoid cycle
        before.next = afterHead.next; // Connect the two partitions
        
        return beforeHead.next;
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
