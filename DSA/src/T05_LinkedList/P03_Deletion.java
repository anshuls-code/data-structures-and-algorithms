package T05_LinkedList;

public class P03_Deletion {

    public static Node deleteHead(Node head) {
        if (head == null) return null;

        // Move head to the next node
        Node curr = head;
        head = head.next;
        curr.next = null; // Detach old head (good practice)

        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) return null;

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;

        return head;
    }

    public static Node deleteAtPos(Node head, int pos) {
        if (head == null || pos < 0) return head;

        // delete head
        if (pos == 0) return head.next;

        // Traverse to node at pos - 1
        Node temp = head;
        for (int i=0; temp != null && i<pos-1; i++) temp = temp.next;

        // Case 2: pos is out of bounds (position does not exist)
        if (temp == null || temp.next == null) return head;

        // Case 3: Unlink target node (temp.next)
        temp.next = temp.next.next;

        return head;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4};
        int val = 1;

        Node head = new Node(arr[0]); // 1 ->
        head.next = new Node(arr[1]); // 1 -> 2
        head.next.next = new Node(arr[2]); // 1 -> 2 -> 3 ->
        head.next.next.next = new Node(arr[3]); // 1 -> 2 -> 3 -> 4 ->

        System.out.print("Before: ");
        P00_PrintList.printList(head);

        Node newHead = deleteAtPos(head, 2);
        System.out.println();
        System.out.print("After: ");
        P00_PrintList.printList(newHead);
    }
}
