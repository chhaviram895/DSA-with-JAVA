// Write a program to remove duplicates from an integer array.

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 8, 7, 7 };
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ans.contains(ele) == false) {
                ans.add(ele);
            }
        }
        System.out.println("Result-->" + ans);
    }
}
