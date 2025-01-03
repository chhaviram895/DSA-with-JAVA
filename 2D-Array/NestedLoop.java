// How do you iterate through a 2D array using nested loops? 
public class NestedLoop {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                int element = arr[r][c];
                System.out.println(" row " + r + " and column " + c + ": " + element);
            }
        }
    }
}
