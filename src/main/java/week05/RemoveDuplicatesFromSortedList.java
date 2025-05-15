package week05;

public class RemoveDuplicatesFromSortedList {

//    Linked List class
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

//    Solution
    public static ListNode removeDuplicatesFromSortedList(ListNode head){
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;
        if(head == null){
            return dummy_head.next;
        }
        int value = head.val;
        l3.next = new ListNode(head.val);
        l3 = l3.next;

        while(head != null){
            if(head.val != value){
                l3.next = new ListNode(head.val);
                value = head.val;
                l3 = l3.next;
            }
            head = head.next;
        }
        return dummy_head.next;
    }

//    creating new linked list using array
    public static ListNode createList(int[] values){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int val : values){
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

//    displaying the linked list
    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val);
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,3,3};
        ListNode list = createList(arr);
        System.out.println("original linked list");
        printList(list);
        ListNode list2 = removeDuplicatesFromSortedList(list);
        System.out.println("updated linked list");
        printList(list2);
    }
}
