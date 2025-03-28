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
    private  static int size = 0;
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
        if(index == size)
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
        size++;
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

    public int deleteFirst()
    {
        int data = head.data;
        head = head.next;
        if(tail.next == null && head.next == null)
        {
            tail = null;
            head = null;
        }

        size--;
        return data;
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
    public int deleteLast()
    {
      if (size<=1)
      {
          return deleteFirst();
      }

      Node node = getNode(size-2);
      int data = tail.data;
      tail = node;
      tail.next = null;
      size--;
       return data;
    }
    public int deleteIndexPosition(int index)
    {
        if(index == 0)
        {
            return deleteFirst();
        }
        if(index == size-1)
        {
            return deleteLast();
        }
        Node prev = head;
        for(int i = 1;i<index;i++)
        {
            prev = prev.next;
        }
        Node target = prev.next;
        int data = target.data;
        prev.next = target.next;
        size--;
        return data;
    }
    public int getSize()
    {
        return size;
    }

    public void removeDuplication()
    {
        Node temp = head;
        while (temp != null && temp.next != null)
        {
            if(temp.data == temp.next.data)
            {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
    }
}

public class LinkedListOperation {
    public static void main(String[] args) {
       Operation operation = new Operation();
       operation.insertAtLast(10);
       operation.insertAtLast(20);
       operation.insertAtLast(20);
       operation.insertAtLast(30);
        operation.insertAtLast(20);
        operation.insertAtLast(60);
       operation.insertInMiddle(44,3);
       operation.display();
        System.out.println("\n"+"-".repeat(30));
        System.out.print("\nInsertion at from Last/Tail : ");
        operation.display();
        System.out.println("\nsize is : "+operation.getSize());
        System.out.println("\n"+"-".repeat(30));

        System.out.println("size is : "+operation.getSize());
        System.out.println("delete first element i.e., : "+operation.deleteFirst());
        System.out.print("After Deleting : ");
        operation.display();
        System.out.println("\nsize is : "+operation.getSize());
        System.out.println("\n"+"-".repeat(30));

        System.out.println("size is : "+operation.getSize());
        System.out.println("delete Last element i.e., : "+operation.deleteLast());
        System.out.print("After Deleting : ");
        operation.display();
        System.out.println("\nsize is : "+operation.getSize());
        System.out.println("-".repeat(30));

        System.out.println("size is : "+operation.getSize());
        System.out.println("delete Last element i.e., : "+operation.deleteIndexPosition(2));
        System.out.print("After Deleting : ");
        operation.display();
        System.out.println("\nsize is : "+operation.getSize());

        System.out.println("-".repeat(30));
        System.out.println("After removing duplication : ");
        operation.removeDuplication();
        operation.display();
    }
}
