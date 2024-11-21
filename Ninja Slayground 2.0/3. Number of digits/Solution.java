// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        while(n > 0) {
            n = n / 10;
            count += 1;
        }
        return count;
    }
}