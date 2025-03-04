public class FindingPossiblePathToDestinationIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(countForBestPath(arr,0,0,arr.length));
        path("",arr,1,1,arr.length);
    }
    static  int count = 0;
    public static int countForBestPath(int[][] arr,int i,int j,int end)
    {
        if(i == end-1|| j == end-1)
        {
            return 1;
        }
       count =  countForBestPath(arr,i+1,j,end)+countForBestPath(arr,i,j+1,end);;
        return count;
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
