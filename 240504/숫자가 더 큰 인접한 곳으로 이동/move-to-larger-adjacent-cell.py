n, r, c = map(int, input().split())

grid = [
    list(map(int, input().split())) 
    for _ in range(n)
]

drs = [1, -1, 0, 0]
dcs = [0, 0, -1, 1]

def in_range(r, c):
    return 0 <= r < n and 0 <= c < n

def simulate(r, c):
    print(grid[r][c], end=' ')
    for dr, dc in zip(drs, dcs):
        nr, nc = r + dr, c + dc
        if in_range(nr, nc) and grid[nr][nc] > grid[r][c]:
            simulate(nr, nc)
            return

simulate(r - 1, c - 1)