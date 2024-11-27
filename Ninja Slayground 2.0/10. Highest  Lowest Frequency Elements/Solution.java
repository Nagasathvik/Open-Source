// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] getFrequencies(int[] v) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : v) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = -1;
        int minFreq = Integer.MAX_VALUE;
        int maxFreqElement = -1;
        int minFreqElement = -1;
        
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            
            if (freq > maxFreq || (freq == maxFreq && num < maxFreqElement)) {
                maxFreq = freq;
                maxFreqElement = num;
            }
            
            if (freq < minFreq || (freq == minFreq && num < minFreqElement)) {
                minFreq = freq;
                minFreqElement = num;
            }
        }
        
        return new int[] { maxFreqElement, minFreqElement };
    }
}
