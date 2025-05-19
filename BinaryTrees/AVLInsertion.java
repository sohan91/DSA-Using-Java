public class AVLInsertion {
    public static void main(String[] args) {
        AVLOperation operation = new AVLOperation();

        for(int i = 1;i<25;i++)
        {
            operation.insert(i);
        }
        operation.display();
    }
}

class TNode
{
    int data;
    TNode left;
    TNode right;
    int height;
    TNode(int data)
    {
        this.data = data;
    }
}
class AVLOperation
{
    TNode root;
    public void insert(int data)
    {
       root = insert(root,data);
    }
    public TNode insert(TNode node,int data)
    {
        if(node == null)
        {
            return new TNode(data);
        }
        if(node.data>data)
        {
            node.left = insert(node.left,data);
        } else if (node.data<data) {
            node.right = insert(node.right,data);
        }
        else {
            return node;
        }
        node.height = 1+Math.max(getHeight(node.left),getHeight(node.right));
        int balance = getBalance(node);
        if(balance > 1 && data<node.left.data)
        {
            return rightRotation(node);
        }
        if(balance < -1 && data > node.right.data)
        {
            return leftRotation(node);
        }
        if(balance < -1 && data<node.right.data)
        {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        if(balance > 1 && data > node.left.data)
        {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        return node;
    }
    private int getHeight(TNode node)
    {
        return node == null ? -1 :node.height;
    }
    private int getBalance(TNode node)
    {
        return node == null ? 0:getHeight(node.left)-getHeight(node.right);
    }
    private TNode leftRotation(TNode node)
    {
        TNode newRoot = node.right;
        TNode temp = newRoot.left;
        newRoot.left = node;
        node.right = temp;
        node.height = 1+Math.max(getHeight(node.left),getHeight(node.right));
        newRoot.height = 1+Math.max(getHeight(newRoot.left),getHeight(newRoot.right
        ));
        return newRoot;
    }
    private TNode rightRotation(TNode node)
    {
        TNode newRoot = node.left;
        TNode temp = newRoot.right;
        newRoot.right = node;
        node.left = temp;
        node.height = 1+Math.max(getHeight(node.left),getHeight(node.right));
        newRoot.height = 1+Math.max(getHeight(newRoot.left),getHeight(newRoot.right));
                return newRoot;
    }
    public void display()
    {
        display(root,0);
    }
    private void display(TNode node,int lev)
    {
        if(node == null)
        {
            return;
        }
        display(node.right,lev+1);
        if(lev != 0)
        {
            for (int i = 0; i < lev; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--->"+node.data);
        }
        else {
            System.out.println("|--->"+node.data);
        }
        display(node.left,lev+1);
    }
}