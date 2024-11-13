class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class Array2LL {

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
            count++;
        }
        return count;
    }

    private static Node removeHead(Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }

    private static int checkIfPresent(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convertArr2LL(arr);

        //deleting head
        head = removeHead(head);
        print(head);

        //traversal
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        //length
        System.out.println(lengthOfLL(head));

        //check for the value if present
        System.out.println(checkIfPresent(head, 30));
    }
}
