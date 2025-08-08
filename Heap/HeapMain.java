import java.util.ArrayList;

public class HeapMain {
    public static void main(String[] args) throws Exception {
        HeapImplementation heap = new HeapImplementation();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);


        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}
