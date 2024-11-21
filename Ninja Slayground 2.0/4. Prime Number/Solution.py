#Learn the code, And copy and paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

import math
def isPrime(n:int) -> bool:
    # Write your code here
    if n <= 1:
        return False
    for i in range(2,math.ceil(math.sqrt(n))):
        if n % i == 0:
            return False
    return True