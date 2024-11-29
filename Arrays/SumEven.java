// Write a program to find the sum of elements at even indexes in an integer array.
public class SumEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
