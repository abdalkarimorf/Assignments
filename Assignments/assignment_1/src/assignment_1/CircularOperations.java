package assignment_1;

class CNode {
    int data;
    CNode next;

    CNode(int d) {
        data = d;
    }
}

public class CircularOperations {

    static CNode insertAtPos(CNode head, int data, int pos) {
        CNode newNode = new CNode(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        CNode temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static CNode deleteAtPos(CNode head, int pos) {
        if (pos == 0)
            return head.next;
        CNode temp = head;
        for (int i = 0; i < pos - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }

    static boolean search(CNode head, int key) {
        CNode temp = head;
        do {
            if (temp.data == key)
                return true;
            temp = temp.next;
        } while (temp != head);
        return false;
    }
}
