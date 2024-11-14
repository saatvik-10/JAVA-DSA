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

    private static int checkIfPresent(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }

    //DELETION
    private static Node removeHead(Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }

    private static Node removeTail(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node removeK(Node head, int K) {
        if (head == null) return head;
        if (K == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == K) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node removeVal(Node head, int val) {
        if (head == null) return head;
        if (head.data == val) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //INSERTION
    private static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    private static Node insertTail(Node head, int val) {
        if (head == null) return new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    private static Node insertK(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) return new Node(val);
            else return null;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertVal(Node head, int el, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            return new Node(el, head);
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node newNode = new Node(el, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8 };
        Node head = convertArr2LL(arr);

        // //deleting head
        // head = removeHead(head);
        // print(head);

        // //deleting tail
        // head = removeTail(head);
        // print(head);

        // //deleting element at Kth position
        // head = removeK(head, 4);
        // print(head);

        // //deleting element at Kth position
        // head = removeVal(head, 8);
        // print(head);

        //inserting head
        // head = insertHead(head, 0);
        // print(head);

        //insertion tail
        // head = insertTail(head, 9);
        // print(head);

        // //inserting at kth position
        // head = insertK(head, 10, 3);
        // print(head);

        //inserting element before kth element
        head = insertVal(head, 10, 4);
        print(head);
        //traversal
        // Node temp = head;
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

        // //length
        // System.out.println(lengthOfLL(head));

        // //check for the value if present
        // System.out.println(checkIfPresent(head, 30));
    }
}
