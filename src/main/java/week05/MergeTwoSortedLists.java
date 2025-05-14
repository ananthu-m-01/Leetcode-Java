package week05;

public class MergeTwoSortedLists {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                l3.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                l3.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            l3 = l3.next;
        }
        while (list1 != null) {
            l3.next = new ListNode(list1.val);
            list1 = list1.next;
            l3 = l3.next;
        }

        while (list2 != null) {
            l3.next = new ListNode(list2.val);
            list2 = list2.next;
            l3 = l3.next;
        }

        return dummy_head.next;
    }
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;

    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        ListNode merged = mergeTwoLists(list1, list2);
        System.out.println("Merged List:");
        printList(merged);
    }
}
