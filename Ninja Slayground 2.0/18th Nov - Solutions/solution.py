#Learn the code, And copy and paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

from typing import *
import math
def areaSwitchCase(ch: int, a: List[float]):
    # Write your code here
    if ch == 1:
        return "{:.5f}".format(math.pi*(a[0]*a[0]))
    return "{:.5f}".format(a[0] * a[1])
