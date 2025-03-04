public class FindingPossiblePathToDestinationIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println("Possible Path count is : "+countForBestPath(arr,1,1,arr.length));
        path("",arr,1,1,arr.length);
    }
    public static int countForBestPath(int[][] arr,int i,int j,int end)
    {
        if(i == end && j == end) {
            return 1;
        }
            int left = 0;
            if (i<end) {
                left = countForBestPath(arr, i +1, j,end);
            }
            int right = 0;
            if (j <end) {
                right = countForBestPath(arr, i, j +1,end);
            }

        return left+right;
    }

    public static void path(String name, int[][] arr, int i, int j, int end) {
        if (i == end && j == end) {
            System.out.println("path(" + i + "," + j + ")" + name);
            return;
        }

        if (i<end) {
            path(name + "D", arr, i + 1, j, end);
        }
        if (j<end) {
            path(name + "R", arr, i, j + 1, end);
        }
    }
}
