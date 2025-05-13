import java.util.Scanner;

public class BinaryTreeImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();
        op.insertion(sc);
        op.displayInTree();

    }
}
class Node
{
    int data;
    Node left = null;
    Node right = null;
    Node ()
    {

    }
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Operation
{
    Nodes root;
    public void insertion(Scanner scanner)
    {
        System.out.print("Enter value to set as root : ");
        int data = scanner.nextInt();
        root = new Nodes(data);
        toLefttoRightInsertion(scanner,root);

    }
    public void toLefttoRightInsertion(Scanner scanner, Nodes nodes)
    {
        try {
            System.out.print("Do you want to place the element left to "+ nodes.data+" : ");
            boolean left = scanner.nextBoolean();
            if (left) {
                System.out.print("Enter the value : ");
                int value = scanner.nextInt();
                nodes.left = new Nodes(value);
                toLefttoRightInsertion(scanner, nodes.left);
            }
            System.out.print("Do you want to place the element to right "+ nodes.data+" : ");
            boolean right = scanner.nextBoolean();
            if (right) {
                System.out.print("Enter the value : ");
                int value = scanner.nextInt();
                nodes.right = new Nodes(value);
                toLefttoRightInsertion(scanner, nodes.right);
            }
        }catch (Exception e)
        {
            display(root);
            System.out.println(e.getMessage());
        }
    }
    public void display(Nodes root)
    {
        if(root == null)
        {
            return;
        }
       display(root.left);
        System.out.print(root.data+" ");
       display(root.right);
    }
    public void displayInTree()
    {
        treeDisplay(root,0);
    }
    public void treeDisplay(Nodes nodes, int level)
    {
        if(nodes == null)
        {
            return;
        }
        treeDisplay(nodes.right,level+1);
        if(level != 0)
        {
            for(int i = 0;i<level-1;i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+ nodes.data);
        }
        else {
            System.out.println(nodes.data);
        }
        treeDisplay(nodes.left,level+1);
    }

}
