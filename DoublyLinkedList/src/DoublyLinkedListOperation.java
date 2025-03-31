// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class DoublyLinkedListOperation {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.insertLast(10);
        op.insertLast(20);
        op.insertLast(30);
        op.insertLast(40);
        op.insertLast(50);
        op.insertLast(60);
        op.insertIndex(2,35);
        op.displayFromStart();
        op.deleteFirst();
        op.displayFromStart();
        op.deleteLast();
        op.displayFromStart();
        op. deleteIndexPosition(2);
        op.displayFromStart();
    }
}
class Node
{
    int data;
    Node prev;
    Node next;
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
    private static int size = 0;

    public void insertFirst(int data)
    {
        Node node = new Node(data);
        if(head == null || tail == null)
        {
            head = node;
            tail = node;
            size++;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
        size++;
    }

    public void insertLast(int data)
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
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertIndex(int index,int value)
    {
        if(index == 0)
        {
            insertFirst(value);
            return;
        }

        if(index == size)
        {
            insertLast(value);
            return;
        }

        if(index>0 && index<size)
        {
            Node temp = head;
            for(int i = 1;i<index;i++)
            {
                temp = temp.next;
            }
            Node node = new Node(value);
            node.prev = temp;
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            size++;
        }
        else
        {
            System.out.println("List is Empty...");
            return;
        }
    }

    public void displayFromStart()
    {
        Node temp = head;
        if(head == null || tail == null)
        {
            System.out.println("List is Empty...");
            return;
        }
        while(temp != null)
        {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.print("END\n");
    }
    public void displayFromEnd()
    {
        Node temp = tail;
        if(head == null || tail == null)
        {
            System.out.println("List is Empty...");
            return;
        }
        while(temp != null)
        {
            System.out.print(temp.data+" <-> ");
            temp = temp.prev;
        }
        System.out.print("START\n");
    }

    public void deleteFirst()
    {
        if(head == null || tail == null)
        {
            System.out.println("Already list is Empty...");
            return;
        }
        int value = head.data;
        head = head.next;
        head.prev = null;
        System.out.println("Deleted Element at First is "+value);
        size--;
    }
    public void deleteLast()
    {
        if(head == null || tail == null)
        {
            System.out.println("Already list is Empty...");
            return;
        }
        int value = tail.data;
        tail = tail.prev;
        tail.next = null;
        System.out.println("Deleted Element at Last is "+value);
        size--;
    }

    public void deleteIndexPosition(int index)
    {
        if(index == 0)
        {
            deleteFirst();
            return;
        }
        if(index == size)
        {
            deleteLast();
            return;
        }

        if(index>0 && index<size)
        {
            Node temp = head;
            for(int i = 1;i<index;i++)
            {
                temp = temp.next;
            }
            int value = temp.next.data;
            temp.next = temp.next.next;
            temp.prev = temp.prev.prev;
            System.out.println("Deleted Elemetn is at "+index+" is : "+value);
            size--;
        }
        else
        {
            System.out.println("List is Empty can't perform Actions..");
            return;
        }
    }
}