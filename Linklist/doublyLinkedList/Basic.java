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

    //DELETIONS
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

    private static Node removeK(Node head, int K) {
        if (head == null) return null;

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            if (count == K) {
                break;
            } else {
                temp = temp.next;
            }
        }

        Node prev = temp.back;
        Node front = temp.next;

        if (prev == null && front == null) {
            return null;
        } else if (prev == null) {
            return removeHead(head);
        } else if (front == null) {
            return removeTail(head);
        } else if (prev != null && front != null) {
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }

    private static void removeVal(Node head) {
        //No deletion of head bcz of more and more conditions then...
        Node prev = head.back;
        Node front = head.next;

        if (front == null) {
            prev.next = null;
            head.back = null;
        }
        //basic condition
        prev.next = front;
        front.back = prev;
        head.next = null;
        head.back = null;
    }

    //INSERTIONS
    private static Node insertHeadB4(Node head, int val) {
        Node newHead = new Node(val, head, null); //(value to insert, next, prev)
        head.back = newHead;
        return newHead;
    }

    private static Node insertB4Tail(Node head, int val) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        Node prev = temp.back;
        Node newPrevTail = new Node(val);
        prev.next = newPrevTail;
        newPrevTail.next = temp;
        temp.back = newPrevTail;

        return head;
    }

    private static Node insertB4K(Node head, int val, int K) {
        Node temp = head;

        if (K == 1) {
            return insertHeadB4(head, val);
        }

        int count = 0;
        while (temp != null) {
            count++;
            if (count == K) {
                break;
            } else {
                temp = temp.next;
            }
        }

        Node newVal = new Node(val);
        Node prev = temp.back;
        prev.next = newVal;
        newVal.next = temp;
        temp.back = newVal;

        return head;
    }

    private static void insertB4Val(Node node, int val) {
        //no insertion of value b4 head, we will not change the head
        Node prev = node.back;

        Node newNode = new Node(val, node, prev);
        prev.next = newNode;
        newNode.next = node;
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

        // deletion of element at kth position
        head = removeK(head, 1);
        print(head);

        //deletion of an element
        removeVal(head.next);
        print(head);

        // insertion of new head
        head = insertHeadB4(head, 10);
        print(head);

        //insertion of element b4 tail
        head = insertB4Tail(head, 15);
        print(head);

        //insert b4 kth element
        head = insertB4K(head, 10, 3);
        print(head);

        //insertion of val b4 element
        insertB4Val(head.next, 10);
        print(head);
    }
}
