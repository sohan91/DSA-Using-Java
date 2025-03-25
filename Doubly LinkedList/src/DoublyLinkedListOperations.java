import java.awt.print.Paper;

public class DoublyLinkedListOperations {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.insertLast(29);
        operation.insertLast(29);
        operation.insertLast(2);
        operation.insertLast(22);
        operation.insertLast(11);
        operation.insertLast(3);
        operation.insertAtIndex(2,144);
        operation.displayFor();

        operation.deleteFirst();
        operation.displayFor();

        operation.deleteEnd();
        operation.displayFor();

        operation.deleteIndex(2);
        operation.displayFor();
    }
}
class Node
{

    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class Operation
{
    static  int size  = 0;
    Node head = null;
    Node tail = null;

    public void insertionFirst(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            tail = node;
            size++;
             return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertLast(int data)
    {
        Node node = new Node(data);
        if(tail == null)
        {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertAtIndex(int index,int data)
    {
        Node node = new Node(data);
        if(head == null || tail == null)
        {
            head = node;
            tail = node;
            size++;
            return;
        }
        if(index == 0)
        {
            insertionFirst(data);
            size++;
            return;
        }
        if(index == size-1)
        {
            insertLast(data);
            size++;
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.prev = temp;
        node.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = node;
        }
        temp.next = node;
        size++;

    }
    public void displayRev()
    {
        if(tail == null)
        {
            System.out.println("List is Empty...");
            return;
        }
        Node node = tail;
        System.out.print("Print Reverse : ");
        while (node != null)
        {
            System.out.print(node.data+" -> ");
            node = node.prev;
        }
        System.out.println("START");
    }
    public void displayFor()
    {
        if(head == null)
        {
            System.out.println("List is Empty...");
            return;
        }
        Node node = head;
        System.out.print("Print Forward : ");
        while (node != null)
        {
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void deleteFirst()
    {
        if(head == null || tail == null)
        {
            System.out.println("List is Empty...");
            return;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        System.out.println("Delete First Element is : "+value);
        size--;
    }

    public void deleteEnd(){
        if(head == null || tail == null)
        {
            System.out.println("List is Empty...");
            return;
        }

        int value = tail.data;
        Node temp = head;
       while (temp.next != tail)
       {
           temp = temp.next;

       }
       tail.prev = temp.prev;
        temp.next = null;
       tail = temp;
        System.out.println("Delete Last Element is : "+value);
        size--;
    }

    public void deleteIndex(int index)
    {
        if(head == null || tail == null)
        {
            System.out.println("List is Empty...");
            return;
        }

        if(index == 0)
        {
            deleteFirst();
            return;
        }
        if(index == size-1)
        {
            deleteEnd();
            return;
        }

        if(index >= 0 && index<size-1)
        {
            Node temp = head;
            for(int i = 1;i<=index;i++)
            {
                 temp = temp.next;//3->4->2->9->
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

            System.out.println("index "+index+" element "+temp.data+" is Deleted ");
             size--;
        }
    }
}
