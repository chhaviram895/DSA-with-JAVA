// Write a program to find the product of elements at odd indexes in an integer array.
public class ProductOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,5, 6, 8, 10 };
        int p = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                p *= arr[i];
            }
        }
        System.out.println(p);
    }
}
