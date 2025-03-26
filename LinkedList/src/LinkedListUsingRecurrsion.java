public class LinkedListUsingRecurrsion {
    public static void main(String[] args) {
        RecursionOperation op = new RecursionOperation();
        op.insertAtLast(20);
        op.insertAtLast(23);
        op.insertAtLast(28);
        op.insertAtLast(18);
        op.insertAtLast(30);
        op.display();
        op.insert(2,44);
        op.display();
    }
}
class RecursionOperation
{
    Node head = null;
    Node tail = null;
    static int size = 0;
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
    public void insert(int index,int value)
    {
        head = insertRec(index,value,head);
    }
    public Node insertRec(int index,int value,Node node)
    {
        if(index == 0)
        {
            Node temp = new Node(value,node);
            size++;
            return temp;
        }

        node.next = insertRec(index-1,value,node.next);
        return node;
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
        System.out.print("END\n");
    }

}