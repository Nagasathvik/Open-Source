#Learn the code, Copy and Paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

from sys import *
from collections import *
from math import *

def zeroMatrix(matrix, n, m):
    first_row_zero = any(matrix[0][j] == 0 for j in range(m))
    first_col_zero = any(matrix[i][0] == 0 for i in range(n))
    
    for i in range(1, n):
        for j in range(1, m):
            if matrix[i][j] == 0:
                matrix[i][0] = 0
                matrix[0][j] = 0

    for i in range(1, n):
        for j in range(1, m):
            if matrix[i][0] == 0 or matrix[0][j] == 0:
                matrix[i][j] = 0
    
    if first_row_zero:
        for j in range(m):
            matrix[0][j] = 0
    
    if first_col_zero:
        for i in range(n):
            matrix[i][0] = 0

    return matrix
