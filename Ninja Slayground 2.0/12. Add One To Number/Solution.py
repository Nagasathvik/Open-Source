#Learn the code, Copy and Paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

from os import *
from sys import *
from collections import *
from math import *

def addOneToNumber(arr):
    #   Write your code here
    n = len(arr)
    carry = 1
    for i in range(n - 1, -1, -1):
        arr[i] += carry
        if arr[i] > 9:
            arr[i] = 0
            carry = 1
        else:
            carry = 0
            break
    if carry:
        arr.insert(0, 1)
    while arr[0] == 0:
        arr.pop(0)
    return arr
