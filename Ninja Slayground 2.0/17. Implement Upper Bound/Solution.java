// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

