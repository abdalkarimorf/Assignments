package assignment_1;

public class Q9_RemoveAtPos {
    static Node remove(Node head, int pos) {
        if (pos == 0) return head.next;

        Node temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;

        temp.next = temp.next.next;
        return head;
    }
}
