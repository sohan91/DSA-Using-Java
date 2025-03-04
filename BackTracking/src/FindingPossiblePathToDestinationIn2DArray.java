public class FindingPossiblePathToDestinationIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(countForBestPath(arr,0,0,arr.length));
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

}
