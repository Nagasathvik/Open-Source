// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

import java.util.Arrays;

public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        Arrays.sort(a);
        
        int secondLargest = a[n - 2];
        int secondSmallest = a[1];
        
        return new int[] { secondLargest, secondSmallest };
    }
}
