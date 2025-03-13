class Node
{
    int data;
    Node next;
   Node(int data)
   {
       this.data = data;
       this.next = null;
   }
}
class Operation{
    Node tail = null;
    Node head = null;

    public void insertAtFirst(int data)
    {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
    }

    public void insertAtLast(int data)
    {
        Node node = new Node(data);
        if(tail == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
    }
    public void display()
    {
        if(head == null)
        {
            System.out.println("List is Empty.......");
            return;
        }
        Node temp;
        temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
}

public class LinkedListOperation {
    public static void main(String[] args) {
       Operation operation = new Operation();
       operation.insertAtLast(10);
       operation.insertAtLast(20);
       operation.insertAtLast(12);
       operation.insertAtLast(30);
        System.out.println("-".repeat(30));
        System.out.print("Insertion at from Last/Tail : ");
        operation.display();
        System.out.println("\n"+"-".repeat(30));
        operation.insertAtFirst(39);
        operation.insertAtFirst(22);
        operation.insertAtFirst(21);
        operation.insertAtFirst(12);
        System.out.print("Insert at from Head/Start : ");
        operation.display();
        System.out.println("\n"+"-".repeat(30));


    }
}
