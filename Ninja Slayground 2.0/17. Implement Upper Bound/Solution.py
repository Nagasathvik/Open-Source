#Learn the code, Copy and Paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

def upperBound(arr: [int], x: int, n: int) -> int:
    left, right = 0, n
    while left < right:
        mid = left + (right - left) // 2
        if arr[mid] <= x:
            left = mid + 1
        else:
            right = mid
    return left
