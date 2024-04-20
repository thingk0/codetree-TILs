N = int(input())
grid = [list(map(int, input().split())) for _ in range(N)]
drs, dcs = [-1, -1, 1, 1], [1, -1, -1, 1]

def in_range(r, c):
    return 0 <= r < N and 0 <= c < N

def get_max_sum(r, c, k, l):
    sum_num = 0
    move = [k, l, k, l]
    for dr, dc, mv in zip(drs, dcs, move):
        for _ in range(mv):
            r, c = r + dr, c + dc
            if not in_range(r, c):
                return 0
            sum_num += grid[r][c]

    return sum_num

res = 0
for r in range(N):
    for c in range(N):
        for k in range(1, N):
            for l in range(1, N):
                res = max(res, get_max_sum(r, c, k, l))

print(res)