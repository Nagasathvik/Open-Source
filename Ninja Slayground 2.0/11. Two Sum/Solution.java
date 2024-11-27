// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static String read(int n, int[] book, int target) {
        Set<Integer> seen = new HashSet<>();
        
        for (int pages : book) {
            int complement = target - pages;
            if (seen.contains(complement)) {
                return "YES";
            }
            seen.add(pages);
        }
        
        return "NO";
    }
}
