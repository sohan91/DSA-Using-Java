public class CircularListOperation {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.insertion(10);
        operation.insertion(20);
        operation.insertion(11);
        operation.insertion(3);
        operation.insertion(4);
        operation.insertion(12);
        operation.display();
        operation.delete(20);
        operation.display();
    }
}
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
class Operation
{
    Node head = null;
    Node tail = null;
    static int size = 0;
    public void insertion(int data)
    {
        Node node = new Node(data);
        if(tail == null || head == null)
        {
            head = node;
            tail = node;
            size++;
            return;
        }
       tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void display()
    {
        if(tail == null || head == null)
        {
            System.out.println("List is Empty...");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }while(temp != head);
        System.out.print("HEAD");
    }
    public void delete(int value)
    {
        if(head == null || tail == null)
        {
            System.out.println("List is Empty..");
            return;
        }
        if(head.data == value)
        {
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        Node temp = head;
        do
        {
            Node node = temp.next;
            if(node.data == value)
            {
                 temp.next = node.next;
                 if(node == tail)
                 {
                     tail = temp;
                     tail.next = head;
                 }
                 size--;
                System.out.println("Deleted is "+value);
            }
            temp = temp.next;
        }while (temp != head);
    }
}