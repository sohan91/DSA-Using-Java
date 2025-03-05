public class BackTrackForTheAllPossibleDirection {
    public static void main(String[] args) {
        int end = 3;
        boolean[][] booleans = {
                {true,true,true},
                {true,true,true},
                {true,true,true}};
             allDirectionPath(booleans,"",0,0,end);
    }
    public static void allDirectionPath(boolean[][] arr,String name,int i,int j,int end) {
        if (i == end - 1 && j == end - 1) {
            System.out.println(name);
            return;
        }

        if (!(arr[i][j])) {
            return;
        }
        arr[i][j] = false;
        if (i < end-1) {
            allDirectionPath(arr, name + "D", i+1, j, end);
        }
        if (j < end-1) {
            allDirectionPath(arr, name + "R", i, j+1, end);
        }
        if (i >0) {
            allDirectionPath(arr, name + "U", i - 1, j, end);
        }
        if (j>0) {
            allDirectionPath(arr, name + "L", i , j-1, end);
        }
        arr[i][j] = true;
    }
}
