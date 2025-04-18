public class LinkedListOperation
{
    public static void main(String[] args)
    {
        Operation op = new Operation();
        op.insertLast(20);
        op.insertLast(30);
        op.insertLast(40);
        op.insertLast(35);
        op.insertMiddle(2,11);
        op.display();
        op.deleteMiddle(2);
        op.display();
        op.deleteFirst();
        op.display();
        op.deleteLast();
        op.display();
    }
}

class Node
{
    int data;
    Node next;
<<<<<<< HEAD
   Node(int data)
   {
       this.data = data;
       this.next = null;
   }
   Node()
   {
       this.data = 0;
       this.next = null;
   }
    Node(int data,Node next)
=======
    Node(int data)
>>>>>>> 290821700fe59524c631ad841685c282681a90ff
    {
        this.data = data;
        this.next = null;
    }
}

class Operation
{
    static int size = 0;
    Node head = null;
    Node tail = null;

    public void insertFirst(int data)
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
        head = node;
        size++;
    }

    public void insertLast(int data)
    {
        Node node = new Node(data);
        if(tail == null)
        {
            tail = node;
            head = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void display()
    {
        if(head == null)
        {
            System.out.println("List is empty...");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("HEAD\n");
    }

    public void insertMiddle(int index,int data)
    {
        if(head == null && tail == null)
        {
            System.out.print("Can't perform operation on given index....");
            return;
        }
        if(index == 0)
        {
            insertFirst(data);
            size++;
            return;
        }
        if(index == size-1)
        {
            insertLast(data);
            size++;
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        for(int i = 1;i<index;i++)
        {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++; // Update size
    }

    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("List is empty..");
            return;
        }
<<<<<<< HEAD
        Node temp;
        temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("END\n");
    }

    public int deleteFirst()
    {
=======
>>>>>>> 290821700fe59524c631ad841685c282681a90ff
        int data = head.data;
        head = head.next;
        System.out.println("\nDeleted element at first is "+data);
        size--;
    }
    public void deleteLast()
    {

        if(tail == null)
        {
            System.out.println("List is empty..");
            return;
        }
        int data = tail.data;
        Node node = head;
        while(node.next != tail)
        {
            node = node.next;
        }
        node.next = null;
        tail = node;
        size--;
        System.out.println("\nDeleted element at last is "+data);
    }

    public void deleteMiddle(int index)
    {
        if(head == null && tail == null)
        {
            System.out.println("List is empty..");
            return;
        }
        if(index == 0)
        {
            deleteFirst();
            size--;
            return;
        }
        if(index == size-1)
        {
            deleteLast();
            size--;
            return;
        }

        Node node = head;
        for(int i = 1;i<index;i++)
        {
            node = node.next;
        }
        Node temp = node.next;
        System.out.println("Deleted element as per index position is "+temp.data);
        node.next = temp.next;
    }
<<<<<<< HEAD
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
                size--;
            }
            else {
                temp = temp.next;
            }
        }
    }public Operation mergeSortedList(Operation op1,Operation op2)
    {
        Node first = op1.head;
        Node second = op2.head;
        Operation operation = new Operation();
        while(first != null && second != null)
        {

            if(first.data < second.data)
            {
                operation.insertAtLast(first.data);
                first = first.next;
            }
            else {
                operation.insertAtLast(second.data);
                second = second.next;
            }
        }

        while(first != null)
        {
            operation.insertAtLast(first.data);
            first = first.next;
        }
        while(second != null)
        {
            operation.insertAtLast(second.data);
            second = second.next;
        }
        return operation;
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
=======


}
>>>>>>> 290821700fe59524c631ad841685c282681a90ff
