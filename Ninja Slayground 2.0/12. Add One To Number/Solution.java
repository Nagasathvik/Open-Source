// Learn the code, And copy and paste is not allowed. You are required to type...

// Follow this account, for all future code updates on GitHub.

import java.util.* ;
import java.io.*; 

public class Solution
{
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        int n = arr.size();
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            arr.set(i, arr.get(i) + carry);
            if (arr.get(i) > 9) {
                arr.set(i, 0);
                carry = 1;
            } else {
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            arr.add(0, 1);
        }

        while (arr.size() > 0 && arr.get(0) == 0) {
            arr.remove(0);
        }

        return arr;
    }
}
