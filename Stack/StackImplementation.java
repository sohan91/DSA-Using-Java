public class StackImplementation {
  int[] arr;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    StackImplementation()
    {
        this(DEFAULT_SIZE);
    }
    StackImplementation(int size)
    {
        this.arr = new int[size];
    }

    public boolean push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is Full!!");
            return false;
        }
        ptr++;
        arr[ptr] = data;
        return true;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return arr[ptr--];
    }

    public int peek()
    {
        return arr[ptr];
    }

    public boolean isFull()
    {
        return ptr == arr.length-1;
    }
    public boolean isEmpty()
    {
        return ptr == -1;
    }
}
