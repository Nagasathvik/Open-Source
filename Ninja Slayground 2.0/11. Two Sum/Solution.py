#Learn the code, Copy and Paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

def read(n: int, book: [int], target: int) -> str:
    seen = set()
    
    for pages in book:
        complement = target - pages
        if complement in seen:
            return "YES"
        seen.add(pages)
    
    return "NO"
