import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperationOnBinarySearch bst = new OperationOnBinarySearch();
        bst.create(sc);
        bst.display();
        bst.levelOrder();
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
    public void create(Scanner sc) {
        System.out.print("Enter data to set as root Node: ");
        int num = sc.nextInt();
        root = new Nodes(num);

        while (true) {
            System.out.print("Do you want to enter more data (true/false)? ");
            boolean input = sc.nextBoolean();
            if (!input) {
                break;
            }

            System.out.print("Enter the data: ");
            int value = sc.nextInt();
            insertRecursive(value);
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
        System.out.println("Height is : "+height);
    }

}