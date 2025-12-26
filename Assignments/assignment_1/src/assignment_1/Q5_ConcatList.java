package assignment_1;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Q5_ConcatList {
    static Node concat(Node a, Node b) {
        if (a == null) return b;
        Node temp = a;
        while (temp.next != null)
            temp = temp.next;
        temp.next = b;
        return a;
    }
}
