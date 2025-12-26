package assignment_1;

public class Q7_Search {
    static int search(Node head, int key) {
        int pos = 0;
        while (head != null) {
            if (head.data == key)
                return pos;
            pos++;
            head = head.next;
        }
        return -1;
    }
}
