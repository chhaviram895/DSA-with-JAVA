// How do you find the maximum element in an array in Java?
public class MaxEle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,11,5,6,7,8,9};
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}