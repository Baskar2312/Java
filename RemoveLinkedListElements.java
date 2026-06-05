class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class RemoveLinkedListElements {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        
        int val = 6;
        ListNode result = removeElements(head, val);
        printList(result); // Output: 1 -> 2 -> 3 -> 4 -> 5
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; // Skip the node with the target value
            } else {
                current = current.next; // Move to the next node
            }
        }
        
        return dummy.next; // Return the new head of the list
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
