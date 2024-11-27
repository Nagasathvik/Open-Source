#Learn the code, Copy and Paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

from typing import List
from collections import Counter

def getFrequencies(v: List[int]) -> List[int]:
    freq_map = Counter(v)
    max_freq = -1
    min_freq = float('inf')
    max_freq_element = None
    min_freq_element = None
    
    for num, freq in freq_map.items():
        if freq > max_freq or (freq == max_freq and num < max_freq_element):
            max_freq = freq
            max_freq_element = num
        if freq < min_freq or (freq == min_freq and num < min_freq_element):
            min_freq = freq
            min_freq_element = num
    
    return [max_freq_element, min_freq_element]
