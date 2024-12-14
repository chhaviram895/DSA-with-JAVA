// How do you find the length or size of a 2D array?
public class Length {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int r = arr.length;
        int c = arr[0].length;
        System.out.println();
        System.out.println("Number of rows: " + r);
        System.out.println("Number of columns: " + c);
    }
}
