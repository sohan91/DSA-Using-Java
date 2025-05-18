public class SortedElementsToBST {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,10};
        SortedElements sortedElements = new SortedElements();
        sortedElements.insert(arr);
        sortedElements.display();
    }
}
class SortedElements
{
    TreeNode root;
    public void insert(int[] arr)
    {
        root = toBST(arr,0,arr.length-1);
    }
    public TreeNode toBST(int[] arr, int start, int end)
    {
        if(start>=end)
        {
            return root;
        }
        int mid = start+(end-start)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = toBST(arr,start,mid);
        node.right = toBST(arr,mid+1,end);
        return node;
    }
    public void display()
    {
        display(root,0);
    }
    private void display(TreeNode node, int len)
    {
        if(node == null)
            return;
        display(node.right,len+1);
        if(len != 0) {
            for (int i = 0; i < len; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.data);
        }else {
            System.out.println("|------>" + node.data);
        }
        display(node.left,len+1);
    }
}

