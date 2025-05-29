public class DiagonalDestinationPath {
    public static void main(String[] args) {
        path(" ",1,1,4);
    }
    public static void path(String name,int row, int col, int end) {
        if (row == end && col == end) {
            System.out.println("path(" + row + "," + col + ")" + name);
            return;
        }
        if(end>row && col<end)
        {
            path(name+"D",row+1,col,end);
        }
        if (col<end) {
            path(name + "H",  row , col+1, end);
        }
        if(end>row && col<end) {
            path(name + "V", row+1, col + 1, end);
        }
    }
}
