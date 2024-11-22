// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

public class Solution {
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
        
    }
}