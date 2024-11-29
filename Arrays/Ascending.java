// Write a program to check if an array is sorted in ascending order.
public class Ascending {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 5, 6, 7 };
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
