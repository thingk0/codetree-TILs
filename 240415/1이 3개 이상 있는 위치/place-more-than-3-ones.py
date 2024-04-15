N = int(input())
grid = []
for _ in range(N):
    grid.append(list(map(int, input().split())))

drs = (-1, 0, 1, 0)
dcs = (0, 1, 0, -1)

def in_range(r, c):
    return 0 <= r < N and 0 <= c < N

result = 0
for i, row in enumerate(grid):
    for j, value in enumerate(row):
        cnt = 0
        for dr, dc in zip(drs, dcs):
            nr, nc = i + dr, j + dc
            if in_range(nr, nc) and grid[nr][nc] == 1: 
                cnt += 1
        if cnt >= 3:
            result += 1

print(result)