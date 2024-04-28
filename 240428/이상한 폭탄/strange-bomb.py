n, k = map(int, input().split())

ldx = dict()
res = -1

for i in range(n):
    t = int(input())
    if t in ldx and i - ldx[t] <= k:
        res = max(res, t)
    ldx[t] = i

print(res)