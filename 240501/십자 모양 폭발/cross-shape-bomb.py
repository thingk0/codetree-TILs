n = int(input())
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

def in_range(r, c):
    return 0 <= r < n and 0 <= c < n

row, col = map(int, input().split())
row, col = row - 1, col - 1

explosive_range = grid[row][col] - 1

# 가로 
for c in range(col - explosive_range, col + explosive_range + 1):
    if in_range(row, c):
        grid[row][c] = 0
# 세로
for r in range(row - explosive_range, row + explosive_range + 1):
    if in_range(r, col):
        grid[r][col] = 0

# 열 마다 재배치
for c in range(n):
    tmp = [grid[r][c] for r in range(n) if grid[r][c] != 0]
    tmp = [0] * (n - len(tmp)) + tmp
    for r in range(n):
        grid[r][c] = tmp[r]

for i in range(n):
    print(*grid[i])