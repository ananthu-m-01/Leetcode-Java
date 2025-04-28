class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class ReversedLinkedList {
    Node f;
    public void reverse() {
        Node current = f;
        Node prev = null;
        Node temp;

        while (current != null) {
            temp = current.link;
            current.link = prev;
            prev = current;
            current = temp;
        }

        f = prev;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if (f == null) {
            f = newNode;
            return;
        }
        Node temp = f;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = newNode;
    }
    public void printList() {
        Node temp = f;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReversedLinkedList list = new ReversedLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed List:");
        list.printList();
    }
}
