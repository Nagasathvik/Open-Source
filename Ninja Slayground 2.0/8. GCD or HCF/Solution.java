// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

public class Solution {
    public static int calcGCD(int n, int m){
        while(m!=0){
            int t = m;
            m = n % m;
            n = t;
        }
        return n;
    }
}