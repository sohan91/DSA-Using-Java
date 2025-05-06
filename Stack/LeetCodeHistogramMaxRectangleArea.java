import java.util.Stack;

public class LeetCodeHistogramMaxRectangleArea {
    public static void main(String[] args) {
           int[] arr = {2,1,5,6,2,3};
           AreaOfRectangleFromHistogram area = new AreaOfRectangleFromHistogram();
           int num = area.getArea(arr,arr.length);
        System.out.println("Largest Area of rectangle is : "+num);
    }
}
class AreaOfRectangleFromHistogram
{
    public int getArea(int[] heights,int size)
    {
        if( size == 0)
        {
            return size;
        }
        int n = size;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[size];
        int[] right = new int[size];

        for(int i = n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
            {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            stack.pop();
        }

        for(int i = 0;i<n;i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
            {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        int ans = 0;
        for(int i = 0;i<size;i++)
        {
            int width  = right[i] - left[i] - 1;
            int currentArea = heights[i] * width;
            ans = Math.max(ans,currentArea);
        }
        return ans;
    }
}
