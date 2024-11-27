#Learn the code, Copy and Paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

def getSecondOrderElements(n: int,  a: [int]) -> [int]:
    # Write your code here.
    a.remove(max(a))
    a.remove(min(a))

    return [max(a), min(a)]
