class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class OddEvenList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode result = oddEvenList(head);
        printList(result); // Output: 1 -> 3 -> 5 -> 2 -> 4
    }
    
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
        return head;
    }
    
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}