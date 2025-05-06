import java.util.Scanner;

public class BinaryTreeImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();
        op.insertion(sc);
    }
}
class Node
{
    int data;
    Node left = null;
    Node right = null;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Operation
{
    Node root;
    public void insertion(Scanner scanner)
    {
        System.out.print("Enter value to set as root : ");
        int data = scanner.nextInt();
        root = new Node(data);
        toLefttoRightInsertion(scanner,root);
    }
    public void toLefttoRightInsertion(Scanner scanner,Node node)
    {
        try {
            System.out.print("Do you want to place the element to "+node.data+" : ");
            boolean left = scanner.nextBoolean();
            if (left) {
                System.out.print("Enter the value : ");
                int value = scanner.nextInt();
                node.left = new Node(value);
                toLefttoRightInsertion(scanner, node.left);
            }
            System.out.print("Do you want to place the element to right "+node.data+" : ");
            boolean right = scanner.nextBoolean();
            if (right) {
                System.out.print("Enter the value : ");
                int value = scanner.nextInt();
                node.right = new Node(value);
                toLefttoRightInsertion(scanner, node.right);
            }
            display(root);
        }catch (Exception e)
        {
            display(root);
            System.out.println(e.getMessage());
        }
    }
    public void display(Node root)
    {
        if(root == null)
        {
            return;
        }
       display(root.left);
        System.out.print(root.data+" ");
       display(root.right);
    }
}
