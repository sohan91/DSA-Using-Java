class AVLInsertion
{
    public static void main(String[] args)
    {
        AVLOperation operation = new AVLOperation();
        for(int i = 0;i<49;i++)
        {
            operation.insert(i);
        }
        operation.display();
    }
}
class TNode
{
    int data;
    int height;
    TNode left;
    TNode right;
    TNode(int data)
    {
        this.data =data;
        this.height = 1;
    }
}
class AVLOperation
{
    TNode root;
    public void insert(int data)
    {
        root = insert(root,data);
    }
    public TNode insert(TNode tNode, int data)
    {
        if(tNode == null)
        {
            return new TNode(data);
        }
        if(tNode.data > data)
        {
            tNode.left = insert(tNode.left,data);
        }
        else if(tNode.data<data)
        {
            tNode.right = insert(tNode.right,data);
        }
        else
        {
            return tNode;
        }

        tNode.height = 1+Math.max(getHeight(tNode.left),getHeight(tNode.right));
        int balance = getBalance(tNode);

        //RR imbalance -- apply LL rotation
        if(balance < -1 && data > tNode.right.data)
        {
            return leftRotate(tNode);
        }

        //LL imbalance -- apply RR rotation
        if(balance > 1 && data < tNode.left.data)
        {
            return rightRotate(tNode);
        }
        //LR imbalance -- apply LR rotation
        if(balance > 1 && data > tNode.left.data)
        {
            tNode.left = leftRotate(tNode.left);
            return rightRotate(tNode);
        }
        //Rl imbalance -- apply RL rotation
        if(balance < -1 && data < tNode.right.data)
        {
            tNode.right = rightRotate(tNode.right);
            return leftRotate(tNode);
        }
        return tNode;
    }
    //perform LL rotation -- for RR imbalance
    public TNode leftRotate(TNode tNode)
    {
        TNode newRoot = tNode.right;
        TNode temp = newRoot.left;

        newRoot.left = tNode;
        tNode.right = temp;

        tNode.height= 1+Math.max(getHeight(tNode.left),getHeight(tNode.right));
        newRoot.height = 1+Math.max(getHeight(tNode.left),getHeight(tNode.right));
        return newRoot;
    }

    //perform RR rotation -- for LL imbalance
    public TNode rightRotate(TNode tNode)
    {
        TNode newRoot = tNode.left;
        TNode temp = newRoot.right;

        newRoot.right = tNode;
        tNode.left = temp;
        tNode.height= 1+Math.max(getHeight(tNode.left),getHeight(tNode.right));
        newRoot.height = 1+Math.max(getHeight(tNode.left),getHeight(tNode.right));
        return newRoot;
    }
    public int getHeight(TNode tNode)
    {
        if(tNode == null)
        {
            return 0;
        }
        return tNode.height;
    }
    public int getBalance(TNode tNode)
    {
        if(tNode == null)
        {
            return 0;
        }
        return (getHeight(tNode.left)-getHeight(tNode.right));
    }
    public void display()
    {
        display(root,0);
    }
    public void display(TNode tNode, int lvl)
    {
        if(tNode == null)
        {
            return;
        }
        display(tNode.right,lvl+1);
        if(lvl != 0)
        {
            for(int i = 0;i<lvl;i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|--->"+ tNode.data);
        }
        else
        {
            System.out.println("|--->"+ tNode.data);
        }
        display(tNode.left,lvl+1);
    }
}
