public class SegmentTrees {

    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 7, 8, -4, -2};
        SegmentTrees st = new SegmentTrees(arr);
        System.out.println("Segment Tree:");
        st.display();
        System.out.println("\nInterval Sum by index ");
        System.out.println("Query (0 to 3): " + st.query(0, 3));
        System.out.println("Query (2 to 5): " + st.query(2, 5));
        System.out.println("\nUpdate index 3 to 10:");
        st.update(3, 10);
        st.display();
        System.out.println("Query (0 to 3): " + st.query(0, 3));
    }
    static class SegmentNode {
        int data;
        int startInterval;
        int endInterval;
        SegmentNode left;
        SegmentNode right;

        SegmentNode(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    SegmentNode root;

    public SegmentTrees(int[] arr) {
        this.root = constructNode(arr, 0, arr.length - 1);
    }

    public SegmentNode constructNode(int[] arr, int start, int end) {
        if (start == end) {
            SegmentNode node = new SegmentNode(start, end);
            node.data = arr[start];
            return node;
        }

        SegmentNode node = new SegmentNode(start, end);
        int mid = start + (end - start) / 2;

        node.left = constructNode(arr, start, mid);
        node.right = constructNode(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display() {
        display(this.root, 0);
    }

    public void display(SegmentNode tNode, int lvl) {
        if (tNode == null) {
            return;
        }

        display(tNode.right, lvl + 1);

        if (lvl != 0) {
            for (int i = 0; i < lvl; i++) {
                System.out.print("|\t\t");
            }
            System.out.print("["+tNode.startInterval+"-"+tNode.endInterval+"]");
            System.out.print("|---> ");
            System.out.println(tNode.data);
        } else {
            System.out.print("["+tNode.startInterval+"-"+tNode.endInterval+"]");
            System.out.print("|---> ");
            System.out.println(tNode.data);
        }

        display(tNode.left, lvl + 1);
    }
    public int query(int first, int second) {
        return query(this.root, first, second);
    }

    public int query(SegmentNode node, int first, int last) {
        if (node == null) return 0;
        if (node.startInterval >= first && node.endInterval <= last) {
            return node.data;
        }
        if (node.endInterval < first || node.startInterval > last){
            return 0;
        }
        return query(node.left, first, last) + query(node.right, first, last);
    }
    public void update(int index, int value) {
        update(this.root, index, value);
    }

    public int update(SegmentNode node, int index, int value) {
        if (node == null) return 0;
        if (node.startInterval == node.endInterval && node.startInterval == index) {
            node.data = value;
            return node.data;
        }
        if (index < node.startInterval || index > node.endInterval)
            return node.data;
        int leftAns = update(node.left, index, value);
        int rightAns = update(node.right, index, value);
        node.data = leftAns + rightAns;
        return node.data;
    }
}
