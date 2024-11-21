// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

public class Solution {
    public static boolean isPrime(int n) {
        //Your code goes here
        if(n <= 1)
            return false;
        for(int i = 2; i < Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }
}