#Learn the code, Copy and Paste is not allowed. You are required to type...

#Follow this account, for all future code updates on GitHub.

def isValidParenthesis(s: str) -> bool:
    t = []
    s = list(s)
    for i in s:
        if t == []:
            t.append(i)
        else:
            if i == ")" and t[-1] == "(" or i == "]" and t[-1] == "[" or i == "}" and t[-1] == "{":
                t.pop()
            else:
                t.append(i)
    if t == []:
        return True
    return False