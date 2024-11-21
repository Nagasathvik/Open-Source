// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

import java.util.Arrays;
public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        int []sa = a.clone();
        Arrays.sort(sa);
        if(Arrays.equals(a, sa))
            return 1;
        return 0;
        
    }
}