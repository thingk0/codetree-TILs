n, k = map(int, input().split())
arr = [
    int(input())
    for _ in range(n)
]
r = [0] * n

ldx = dict()
for i in range(n - 1, -1, -1):
    if arr[i] not in ldx:
        r[i] = -1
    else:
        r[i] = ldx[arr[i]]
    ldx[arr[i]] = i

res = -1
for i in range(n):
    if r[i] != -1 and r[i] - i <= k:
        res = max(res, arr[i])

print(res)