// How do you find the manimum element in an array in Java?
public class MinEle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-11,5,6,7,8,9};
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
