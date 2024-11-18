class Node {

    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        data = data1;
        next = next1;
        back = back1;
    }

    Node(int data1) {
        data = data1;
        next = null;
        back = null;
    }
}

public class Basic {

    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node removeHead(Node head) {
        if (head == null || head.next == null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    private static Node removeTail(Node head) {
        if (head == null || head.next == null) return null;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next = null;
        tail.back = null;

        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 8, 7 };
        Node head = convertArr2DLL(arr);
        print(head);

        //deletion of head
        head = removeHead(head);
        print(head);

        //deletion of tail
        head = removeTail(head);
        print(head);
    }
}
