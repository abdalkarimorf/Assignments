package assignment_1;

public class Q12_SearchDLL {
    static boolean search(DNode head, int key) {
        while (head != null) {
            if (head.data == key) return true;
            head = head.next;
        }
        return false;
    }
}
