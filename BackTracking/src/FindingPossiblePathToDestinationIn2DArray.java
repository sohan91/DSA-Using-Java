public class FindingPossiblePathToDestinationIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println("Possible Path count is : "+countForBestPath(arr,3,3));
        path("",arr,3,3,arr.length);
    }
    public static int countForBestPath(int[][] arr,int i,int j)
    {
        if(i == 1 && j == 1) {
            return 1;
        }
            int left = 0;
            if (i > 1) {
                left = countForBestPath(arr, i - 1, j);
            }
            int right = 0;
            if (j > 1) {
                right = countForBestPath(arr, i, j - 1);
            }

        return left+right;
    }

    public static void path(String name, int[][] arr, int i, int j, int end) {
        if (i == 1 && j == 1) {
            System.out.println("path(" + i + "," + j + ")" + name);
            return;
        }

        if (i>1) {
            path(name + "D", arr, i - 1, j, end);
        }
        if (j >1) {
            path(name + "R", arr, i, j - 1, end);
        }
    }
}
