N,M = map(int, input().split())

grid = [
    list(map(int, input().split()))
    for _ in range(N)
]

vistied = [
    ([0] * M)
    for _ in range(N)
]

def in_range(r, c):
    return 0 <= r < N and 0 <= c < M

drs, dcs = [1, 0], [0, 1]
def move(r = 0, c = 0):
    for dr, dc in zip(drs, dcs):
        nr = r + dr
        nc = c + dc
        if not in_range(nr, nc) or vistied[nr][nc] == 1 or grid[nr][nc] == 0:
            continue
        vistied[nr][nc] = 1
        move(nr, nc)

move()
print(vistied[N - 1][M - 1])