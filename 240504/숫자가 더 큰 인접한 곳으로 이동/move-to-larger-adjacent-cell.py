n, r, c = map(int, input().split())
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

def in_range(r, c):
    return 0 <= r < n and 0 <= c < n

def simulate(r, c):
    drs, dcs = [-1, 1, 0, 0], [0, 0, -1, 1]

    for dr, dc in zip(drs, dcs):
        nr, nc = r + dr, c + dc
        
        if in_range(nr, nc) and grid[nr][nc] > grid[r][c]:
            return (nr, nc, True)

    return (r, c, False)

r, c = r - 1, c - 1
res = [grid[r][c]]
while True:
    r, c, valid = simulate(r, c)
    if not valid:
        break

    res.append(grid[r][c])

print(*res)