import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperationOnBinarySearch bst = new OperationOnBinarySearch();
        bst.create(sc);
        bst.display();
    }
}

class Nodes {
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
}