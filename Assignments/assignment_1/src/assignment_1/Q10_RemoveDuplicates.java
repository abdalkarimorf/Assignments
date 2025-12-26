package assignment_1;

class DNode {
    int data;
    DNode prev, next;

    DNode(int d) {
        data = d;
    }
}

public class Q10_RemoveDuplicates {
    static void removeDup(DNode head) {
        for (DNode i = head; i != null; i = i.next) {
            for (DNode j = i.next; j != null; ) {
                if (i.data == j.data) {
                    j.prev.next = j.next;
                    if (j.next != null)
                        j.next.prev = j.prev;
                }
                j = j.next;
            }
        }
    }
}
