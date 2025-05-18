public class BSTTreeTraversalTechnique {
    public static void main(String[] args) {
        TreeTraversal traversal = new TreeTraversal();
        int[] arr = {30,2,5,6,74,32,54,6};
        for(int i = 0;i<arr.length;i++) {
            traversal.insert(arr[i]);
        }
        traversal.display();
        traversal.traversalTechnique();
    }
}
class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data)
    {
        this.data = data;
    }
    
}
class TreeTraversal
{
    TreeNode root;
    public void insert(int data)
    {
        if(root == null)
        {
            root = new TreeNode(data);
        }
        else {
            insert(root,data);
        }
    }
    private void insert(TreeNode node, int data)
    {
        if (node.data > data)
        {
            if (node.left == null) {
                node.left = new TreeNode(data);
            } else {
                insert(node.left, data); // Correct recursive call
            }
        }
        else
        {
            if (node.right == null) {
                node.right = new TreeNode(data);
            } else {
                insert(node.right, data); // Correct recursive call
            }
        }
    }
    public void display()
    {
        display(root,0);
    }
    public void display(TreeNode node, int level)
    {
        if(node == null)
        {
            return;
        }
        display(node.right,level+1);
        if(level != 0)
        {
            for(int i = 0;i<level;i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.data);
        }else {
            System.out.println("|----->"+node.data);
        }
        display(node.left,level+1);
    }
    public void traversalTechnique()
    {
        System.out.print("PreOrder Traversal: ");
        preOrderTraversal(root);
        System.out.println();
        System.out.print("PostOrder Traversal: ");
        postOrderTraversal(root);
        System.out.println();
        System.out.print("InOrder Traversal: ");
        inOrderTraversal(root);
    }
    public void preOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        System.out.print(node.data+" -> ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public void inOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data+" -> ");
        inOrderTraversal(node.right);
    }
    public void postOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data+" -> ");
    }
}
