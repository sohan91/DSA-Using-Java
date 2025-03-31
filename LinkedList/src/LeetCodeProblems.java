public class LeetCodeProblems {
    public static void main(String[] args) {
        LeetCodeOperations operations = new LeetCodeOperations();
        operations.insertAtLast(20);
        operations.insertAtLast(30);
        operations.insertAtLast(40);
        operations.insertAtLast(50);
        operations.insertAtLast(60);
        operations.insertToFormCycle(2);
        System.out.println("Is Linked List is Cyclic : "+operations.isAcyclic());
        operations.countOfCyclicNode();

    }
}
class LeetCodeOperations
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
    public void insertToFormCycle(int cycleIndex)
    {
        if(head == null || tail == null)
        {
            System.out.println("List is Empty...");
            return;
        }
        Node temp = head;
        if(cycleIndex == 0)
        {
            temp = head;
        }
        for(int i = 1;i<cycleIndex;i++)
        {
            temp = temp.next;
        }
        tail.next = temp.next;
    }

    public boolean isAcyclic()
    {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    public void countOfCyclicNode()
    {
        Node slow = head;
        Node fast = head;
         int count = 0;
        while(fast.next != null && fast != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                Node temp = slow;
                do{
                    count++;
                    temp = temp.next;
                }while(temp != fast);
                System.out.println("Count of Cyclic Nodes are : "+count);
                return;
            }

        }

    }
}