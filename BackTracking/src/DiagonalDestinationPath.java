public class DiagonalDestinationPath {
    public static void main(String[] args) {
        path(" ",1,1,3);
    }
    public static void path(String name,int i, int j, int end) {
        if (i == end && j == end) {
            System.out.println("path(" + i + "," + j + ")" + name);
            return;
        }
        if(end>i && j<end)
        {
            path(name+"D",i+1,j+1,end);
        }
        if (i<end) {
            path(name + "H",  i + 1, j, end);
        }
        if (j<end) {
            path(name + "V", i, j + 1, end);
        }
    }
}
