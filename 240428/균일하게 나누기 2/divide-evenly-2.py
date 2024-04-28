n = int(input())
points = [
    tuple(map(int, input().split()))
    for _ in range(n)
]

max_y = max(p[1] for p in points)

points.sort()

res = 1e3
for b in range(0, max_y+1, 2):
    cnt = [0] * 5

    for _, y in points:
        if y > b:
            cnt[1] += 1
        else:
            cnt[4] += 1
    
    for i in range(n):
        if i == 0 or points[i][0] != points[i - 1][0]:
            res = min(res, max(cnt))
        
        _, y = points[i]
        if y > b:
            cnt[1] -= 1
            cnt[2] += 1
        else:
            cnt[4] -= 1
            cnt[3] += 1

print(res)