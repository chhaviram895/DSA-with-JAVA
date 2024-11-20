// How do you find the index of an element in an array in Java?
import java.util.Scanner;
public class FindEle {
    public static void main(String[] args) {
        Scanner ram=new Scanner(System.in);
        int[]arr={2,3,4,5,6};
        System.out.println("Enter an number...");
        int n=ram.nextInt();
        int ans=-1;

        for(int i = 0; i < arr.length; i++) {
              if (arr[i]==n) {
                ans =i;
                break;
              }
            }
            System.out.println("Result-->");
            System.out.println(ans);
    }
}
