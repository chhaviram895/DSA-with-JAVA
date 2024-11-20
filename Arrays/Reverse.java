// How do you reverse an array in Java?

// First Way---->
public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            int c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
            a++;
            b--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Second Way--->
// public class Reverse {
// public static void main(String[] args) {
// int[] arr ={1,2,3,4,5,6,7,8,9};
// int[] rev =new int[arr.length];

// for( int i = arr.length-1; i>=0;i--){
// rev[arr.length-1-i]=arr[i];
// }
// for(int i=0; i < arr.length; i++){
// System.out.print(rev[i] + " ");
// }
// }
// }
