#Learn the code, And copy and paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

from math import *
from collections import *
from sys import *
from os import *

## Read input as specified in the question.
## Print output as specified in the question.

n = int(input())
l = [0, 1]
for i in range(1, n):
    l.append(l[-1] + l[-2])
print(l[-1])