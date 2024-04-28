n = int(input())
dist = [0, 0] + list(map(int, input().split()))
cost = [0] + list(map(int, input().split()))

min_cost = [0] * (n + 1)
min_cost[2] = cost[1]
for i in range(3, n + 1):
    min_cost[i] = min(min_cost[i - 1], cost[i - 1])

res = 0
for i in range(1, n + 1):
    res += min_cost[i] * dist[i]

print(res)