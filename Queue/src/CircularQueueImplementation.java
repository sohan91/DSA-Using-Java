public class CircularQueueImplementation {
    private int[] arr;
    private  static final int DEFAULT_SIZE = 10;
     CircularQueueImplementation()
    {
        this(DEFAULT_SIZE);
    }
    CircularQueueImplementation(int size)
    {
        this.arr = new int[size];
    }
    int front = 0;
     int end = 0;
     int size = 0;
    public boolean isFull()
    {
        return size == arr.length;
    }
    public boolean insert(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is Full!!!");
            return false;
        }
        arr[end++] = item;
        end = end%arr.length;
        size++;
        return true;
    }
    public void display()
    {
        for(int i = front;i<end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("END");
    }
    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty!!");
            return -1;
        }
        int remove = arr[front++];
        front = front%arr.length;
        size--;
        return remove;
    }
    public boolean isEmpty()
    {
        return size== 0;
    }
    public int front()
    {
        return arr[front];
    }
}
