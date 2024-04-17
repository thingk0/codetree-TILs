str1 = input()
str2 = input()

res = 'Yes'

def compare(str1, str2):
    if len(str1) != len(str2):
        return False
    
    for s1, s2 in zip(sorted(str1), sorted(str2)):
        if s1 != s2:
            return False
    
    return True
    
print('Yes' if compare(str1, str2) else 'No')