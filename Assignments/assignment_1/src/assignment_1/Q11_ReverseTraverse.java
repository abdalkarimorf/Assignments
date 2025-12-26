package assignment_1;

public class Q11_ReverseTraverse {
    static void reversePrint(DNode head) {
        DNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
