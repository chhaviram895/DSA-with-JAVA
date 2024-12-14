
// How do you declare a 2D array in Java?
import java.util.Scanner;

public class Decalre {
    public static void main(String[] args) {
        Scanner ram = new Scanner(System.in);
        int rows = ram.nextInt();
        int columns = ram.nextInt();
        int[][] arr = new int[rows][columns];
    }
}
