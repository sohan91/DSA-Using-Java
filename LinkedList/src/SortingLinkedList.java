public class SortingLinkedList {
    public static void main(String[] args) {
        Sort sort = new Sort();

        for(int i = 7;i>=1;i--)
        {
            sort.insertAtLast(i);
        }
        System.out.println("Original List:");
        sort.display();


        sort.bubbleSorting();
        System.out.println("Sorted List:");
        sort.display();

        sort.reverse();
        System.out.println("Reversing of LinkedList:");
        sort.display();
    }
}
class Sort {
    Node head = null;
    Node tail = null;
    static  int size = 0;

    public void insertAtLast(int data)
    {

        Node node = new Node(data);
        if(head == null || tail == null)
        {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
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
    public Node getNode(int index)
    {  Node node = head;
        if(head == null || tail == null || head == tail)//if list is empty List or single node
        {
            return null;
        }
        for(int i = 0;i<index;i++){//traverse until second last
            node = node.next;
        }
        return node;
    }

    public void bubbleSorting()
    {
        bubbleSort(size-1,0);
    }

    public void bubbleSort(int row,int col)
    {
       if(row == 0)
       {
           System.out.println("List is Empty...");
           return;
       }

       
       if(col < row)
       {
           Node first = getNode(col);
           Node sec = getNode(col+1);

           if(first.data > sec.data)
           {
               if(first == head)
               {
                   head = sec;
                   first.next = sec.next;
                   sec.next = first;

               } else if (sec == tail) {
                   Node prev = getNode(col-1);
                   prev.next =sec;
                   tail = first;
                   first.next = null;
                   sec.next = tail;
               }

               else {
                   Node prev = getNode(col-1);
                   prev.next = sec;
                   first.next = sec.next;
                    sec.next = first;
               }
           }
           bubbleSort(row,col+1);
       }
       else {
bubbleSort(row-1,0);
       }
    }

    public void reverse()
    {
        reversingOfLinkedList(head);
        //reverseListWithoutUsingRecursion(head);
    }

    public void reversingOfLinkedList(Node node)
    {
        if(node == tail)
        {
            head = node;
            return;
        }
        reversingOfLinkedList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public Node useForReverseLinkedListWhenHeadOnlyPresent(Node head) {
        if(head == null || head.next == null)
        {
            //System.out.println("List is Empty....");
            return head;
        }
        Node prev = null;
        Node present = head;
        Node nextNode = present.next;

        while(present != null)
        {
            present.next = prev;
            prev = present;
            present = nextNode;
            if(nextNode != null)
            {
                nextNode = nextNode.next;
            }
        }
        head = prev;
        return head;
    }
}