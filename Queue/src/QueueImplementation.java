public class QueueImplementation {
    private int[] arr;
    private  static final int DEFAULT_SIZE = 10;
    int end = 0;
    QueueImplementation()
    {
        this(DEFAULT_SIZE);
    }
    QueueImplementation(int size)
    {
        this.arr = new int[size];
    }

    public boolean insert(int item)
    {
      if(isFull())
      {
          System.out.println("Queue is Full!!");
          return false;
      }
      arr[end++] = item;
      return true;
    }

    public int remove()
    {
      int remove = arr[0];
      for(int i = 1;i<end;i++)
      {
          arr[i-1] = arr[i];
      }
      end--;
      return remove;
    }
    public int front()
    {
        if(isEmpty())
        {
            System.out.print("No, front of Queue is ");
            return -1;
        }
        return arr[0];
    }
    public void display()
    {
        for(int i=0;i<end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("END");
    }
    public boolean isEmpty()
    {
        return end == 0;
    }
    public boolean isFull()
    {
        return end == arr.length;
    }

}
