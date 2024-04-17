N = int(input())
grid = [list(map(int, input().split())) for _ in range(N)]

def in_range(row, col):
    return 0 <= row < N and 0 <= col < N

def explore(row, col):
    tmp = 0
    for r in range(row, row + 3):
        for c in range(col, col + 3):
            if not in_range(r, c):
                continue
            tmp += grid[r][c]
    return tmp

res = 0
for r in range(N - 2):
    for c in range(N - 2):
        res = max(res, explore(r, c))

print(res)