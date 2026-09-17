package T05_LinkedList;

public class P02_Insertion {

    public static Node insertAtBeginning(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public static Node insertAtEnd(Node head, int val) {
        Node newNode = new Node(val);
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newNode;

        return head;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4};
        int val = 29;

        Node head = new Node(arr[0]); // 1 ->
        head.next = new Node(arr[1]); // 1 -> 2
        head.next.next = new Node(arr[2]); // 1 -> 2 -> 3 ->
        head.next.next.next = new Node(arr[3]); // 1 -> 2 -> 3 -> 4 ->

        System.out.print("Before: ");
        P00_PrintList.printList(head);

        Node newHead1 = insertAtEnd(head, val);
        System.out.println();
        System.out.print("After: ");
        P00_PrintList.printList(newHead1);
    }
}
