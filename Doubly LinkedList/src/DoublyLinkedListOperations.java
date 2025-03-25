public class DoublyLinkedListOperations {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.insertion(29);
        operation.insertion(2);
        operation.insertion(22);
        operation.insertion(11);
        operation.insertion(3);
        operation.displayRev();
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
    Node head = null;
    Node tail = null;

    public void insertion(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            tail = node;
             return;
        }
        node.next = head;
        head.prev = node;
        head = node;
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
}
