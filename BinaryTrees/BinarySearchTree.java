import java.util.*;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperationOnBinarySearch bst = new OperationOnBinarySearch();
        int[] arr = {5,3,2,9,83,100,4,20};
        for(int i = 0;i<arr.length;i++) {
            bst.create(arr[i]);
        }
        bst.display();
        bst.levelOrder();
      int h = bst.height();
        System.out.println("Height of Tree is : "+h);
        bst.zigZagLevelOrder();
    }
}

class Nodes extends Node {
    int data;
    Nodes left, right;

    public Nodes(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class OperationOnBinarySearch {
    Nodes root;

    // Method to create a BST using user input
    public void create(int data)
    {
        if(root == null)
        {
            root = new Nodes(data);
        }
        else {
            insertRecursive(data);
        }
    }

    public void insertRecursive(int value) {
        root = insert(root, value);
    }

    private Nodes insert(Nodes node, int value) {
        if (node == null) {
            return new Nodes(value);
        }

        if (value < node.data) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        return node;
    }
    
    public void display() {
        displayInTree(root, 0);
    }

    private void displayInTree(Nodes nodes, int level) {
        if (nodes == null) return;

        displayInTree(nodes.right, level + 1);
        if(level != 0) {
            for (int i = 0; i < level; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + nodes.data);
        } else {
            System.out.println("|------>" + nodes.data);
        }
        displayInTree(nodes.left, level + 1);
    }


    public void levelOrder()
    {
        levelOrder(this.root);
    }

    private void levelOrder(Nodes node)
    {
        int height = 0;
        Queue<Nodes> queue = new ArrayDeque<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            Nodes temp = queue.poll();
            System.out.print(temp.data+" -> ");
            if(temp.left != null)
            {
                queue.add(temp.left);
            }
            if(temp.right != null)
            {
                queue.add(temp.right);
            }

        }
        System.out.println("END");
    }
    public int height()
    {
        //return height(root);
        return findingHeightUsingLevelOrder(root);
    }
    private int height(Nodes node)
    {
        if(node == null)
        {
            return 0;
        }
        int l = height(node.left);
        int r = height(node.right);
        return Math.max(l,r)+1;
    }

    public int findingHeightUsingLevelOrder(Nodes node)
    {
        Queue<Nodes> queue = new ArrayDeque<>();
        queue.add(node);
        int height = 0;
        while(!queue.isEmpty())
        {
            int queueLen = queue.size();
            height++;
            for (int i = 0;i<queueLen;i++)
            {
                Nodes temp = queue.poll();
                if(temp.left != null)
                {
                    queue.add(temp.left);
                }
                if(temp.right != null)
                {
                    queue.add(temp.right);
                }
            }

        }
        return height;
    }

    public void zigZagLevelOrder()
    {
        zigZagLevelOrder(root);
    }
    public void zigZagLevelOrder(Nodes node)
    {
        Stack<Nodes> s1 = new Stack<>();
        Stack<Nodes> s2 = new Stack<>();
        s1.push(node);
        System.out.print("ZigZag Level Order/Spiral Level Order : ");
        while (!s1.isEmpty() || !s2.isEmpty())
        {
            while (!s1.isEmpty())
            {
                Nodes temp = s1.pop();
                System.out.print(temp.data+" -> ");
                if(temp.left != null)
                {
                    s2.push(temp.left);
                }
                if(temp.right != null)
                {
                    s2.push(temp.right);
                }
            }
            while (!s2.isEmpty())
            {
                Nodes temp = s2.pop();
                System.out.print(temp.data+" -> ");
                if(temp.right != null)
                {
                    s1.push(temp.right);
                }
                if(temp.left != null)
                {
                    s1.push(temp.left);
                }

            }
        }
        System.out.println("END");
    }
}