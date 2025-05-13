package week05;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1_value = (l1 != null) ? l1.val : 0;
            int l2_value = (l2 != null) ? l2.val : 0;

            int current_sum = l1_value + l2_value + carry;
            carry = current_sum / 10;
            int last_digit = current_sum % 10;

            ListNode new_node = new ListNode(last_digit);
            l3.next = new_node;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;
        }

        if (carry > 0) {
            l3.next = new ListNode(carry);
        }

        return dummy_head.next;
    }
}
public class AddTwoNumbers {
    public static ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int digit : digits) {
            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});

        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}
