// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        for(int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = temp;
        }
        return nums;
    }
}