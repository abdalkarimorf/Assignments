package assignment_1;

public class Q6_RotateList {
    static Node rotate(Node head, int k) {
        if (head == null) return head;

        for (int i = 0; i < k; i++) {
            Node temp = head;
            while (temp.next.next != null)
                temp = temp.next;

            Node last = temp.next;
            temp.next = null;
            last.next = head;
            head = last;
        }
        return head;
    }
}
