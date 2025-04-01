
public class SortingLinkedList {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.insertAtLast(2);
        sort.insertAtLast(3);
        sort.insertAtLast(1);
        sort.insertAtLast(5);
        sort.insertAtLast(4);

        System.out.println("Original List:");
        sort.display();

        sort.sortList();

        System.out.println("Sorted List:");
        sort.display();
    }
}

class Sort {
    Node head = null;
    Node tail = null;

    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (tail == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty...");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void sortList() {
        head = mergeSort(head);
    }

    public Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middle = getMiddleNode(node);
        Node rightHead = middle.next;
        middle.next = null;

        Node leftSorted = mergeSort(node);
        Node rightSorted = mergeSort(rightHead);

        return sort(leftSorted, rightSorted);
    }

    public Node getMiddleNode(Node node) {
        Node slow = node;
        Node fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node sort(Node left, Node right) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else if (right != null) {
            current.next = right;
        }

        return dummy.next;
    }
}