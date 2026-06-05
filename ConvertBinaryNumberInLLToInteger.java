class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ConvertBinaryNumberInLLToInteger {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        
        int result = getDecimalValue(head);
        System.out.println("Decimal Value: " + result); // Output: 5
    }
    public static int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = num * 2 + head.val; // Shift left and add current bit
            head = head.next;
        }
        return num;
    }
}
