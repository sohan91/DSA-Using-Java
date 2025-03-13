import java.awt.print.Paper;

public class LinkedListOperations {
    Node head = null;
    Node tail = null;
    static class Node {

        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    public  void insertionAtFirsIndex(int data)
    {
       Node node = new Node(data);
           head = node;
       node.next = head;

       if(tail == null){
           tail = head;
       }
    }

    public void display()
    {
        Node temp;
        temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListOperations operations = new LinkedListOperations();
        operations.insertionAtFirsIndex(20);
        operations.insertionAtFirsIndex(21);
        operations.insertionAtFirsIndex(11);
        operations.insertionAtFirsIndex(10);
        operations.display();
    }
}
