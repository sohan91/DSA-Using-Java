import java.util.ArrayList;
import java.util.List;

public class HeapImplementation<T extends Comparable<T>> {

    private List<T> list;

    public HeapImplementation() {
        list = new ArrayList<>();
    }

    private void swap(int first, int last) {
        T temp = list.get(first);
        list.set(first, list.get(last));
        list.set(last, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    public void insert(T data) {
        list.add(data);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index) {
        if (index == 0) return;
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Cannot remove from empty heap");
        }
        T root = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return root;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(left).compareTo(list.get(min)) < 0) {
            min = left;
        }
        if (right < list.size() && list.get(right).compareTo(list.get(min)) < 0) {
            min = right;
        }

        if (min != index) {
            swap(index, min);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> result = new ArrayList<>();
        while (!list.isEmpty()) {
            result.add(remove());
        }
        return result;
    }
}
