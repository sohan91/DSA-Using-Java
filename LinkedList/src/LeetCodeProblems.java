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

        LeetCodeOperations operations1 = new LeetCodeOperations();
        operations1.insertAtLast(1);
        operations1.insertAtLast(2);
        operations1.insertAtLast(2);
        operations1.insertAtLast(1);
//        operations1.display();
        System.out.println("is List is Palindrome : " +operations1.palindromeCheck());

        LeetCodeOperations operations2 = new LeetCodeOperations();
        operations2.insertAtLast(1);
        operations2.insertAtLast(2);
        operations2.insertAtLast(3);
        operations2.insertAtLast(4);
        operations2.insertAtLast(5);
        operations2.insertAtLast(6);

        operations2.display();
        System.out.print("After rotation :");
        operations2.rotationOfNode(3);
        operations2.display();
    }
}
class  LeetCodeOperations
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
        while(fast != null && fast.next != null)
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
                System.out.println("Count of Cyclic Node are : "+count);
                return;
            }

        }

    }
    public boolean palindromeCheck()
    {
        boolean isPalin;
         isPalin = isPalindrome(head);
        return isPalin;
    }
    public boolean isPalindrome(Node node)
    {
        if(node == null || node.next == null)
        {
            return true;
        }
        Node slow = node;
        Node fast = node;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
        {
            slow = slow.next;
        }
        Node reversedOfMiddleList = reverse(slow);

        Node node1 = node;
        Node node2 = reversedOfMiddleList;

        while(node2 != null)
        {
            if(node1.data != node2.data)
            {
                return false;
            }
            node1 = node1.next;
            node2 = node2.next;
        }
        return true;
    }
    public Node reverse(Node node)
    {

        Node prev = null;
        Node current = node;

        while (current != null)
        {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public void rotationOfNode(int k)
    {
        head = rotation(head,k);
    }
    public Node rotation(Node node,int k)
    {
        if(node == null || node.next == null || k<=1)
        {
          return node;
        }
        Node temp = node;
        int count = 1;
        while(temp.next != null)
        {
            temp = temp.next;
            count++;
        }
            temp.next = head;
        int rotationCount = k%count;
        int skip = count - rotationCount;
        Node newEND = head;
        for(int i = 0;i<skip-1;i++)
        {
            newEND = newEND.next;
        }
        node = newEND.next;
        newEND.next = null;
        return node;
    }

}