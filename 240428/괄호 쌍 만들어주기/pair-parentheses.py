s = input()
n = len(s)
r = [0] * n


r[n - 1] = 0
for i in range(n - 2, -1, -1):
    if  s[i] == ')' and s[i + 1] == ')':
        r[i] = r[i + 1] + 1
    else:
        r[i] = r[i + 1]

res = 0
for i in range(n - 2):
    if s[i] == '(' and s[i + 1] == '(':
        res += r[i + 2]

print(res)