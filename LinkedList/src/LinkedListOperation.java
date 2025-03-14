class Node
{
    int data;
    Node next;
   Node(int data)
   {
       this.data = data;
       this.next = null;
   }
    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }
}
class Operation{
    private  static int size = 1;
    Node tail = null;
    Node head = null;

    public void insertAtFirst(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            tail = node;
            head = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void insertAtLast(int data)
    {
        Node node = new Node(data);
        if(tail == null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertInMiddle(int data,int index)
    {
        if(index>size-1 || index<0)
        {
            System.out.println("Invalid Index...Can't Perform Operation !!!");
            return;
        }
        if(index == 0)
        {
            insertAtFirst(data);
            return;
        }
        if(index == size-1)
        {
            insertAtLast(data);
            return;
        }
        Node temp = head;
        for(int i = 1;i<index;i++)
        {
            temp = temp.next;
        }
        temp.next = new Node(data,temp.next);
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
       operation.insertInMiddle(44,3);
       operation.display();
        System.out.println("\n"+"-".repeat(30));
        System.out.print("\nInsertion at from Last/Tail : ");
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
