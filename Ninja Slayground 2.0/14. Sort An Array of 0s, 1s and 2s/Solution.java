// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

import java.util.* ;
import java.io.*; 

public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                Collections.swap(arr, low, mid); // Swapping elements using Collections.swap()
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                Collections.swap(arr, mid, high); // Swapping elements using Collections.swap()
                high--;
            }
        }
    }

}