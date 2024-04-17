str1 = input()
str2 = input()

res = 'Yes'
for s1, s2 in zip(sorted(str1), sorted(str2)):
    if s1 != s2:
        res = 'No'
        break
    
print(res)