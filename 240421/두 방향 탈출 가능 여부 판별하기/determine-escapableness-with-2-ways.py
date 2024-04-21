N, M = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(N)]
drs, dcs = [1, 0], [0, 1]
visited = set()

def in_range(r, c):
    return 0 <= r < N and 0 <= c < M

res = 0
def dfs(r = 0, c = 0):
    global res
    if (r, c) in visited or grid[r][c] == 0:
        return

    if (r == N - 1) and (c == M - 1):
        res = 1
        return 

    visited.add((r, c))
    for dr, dc in zip(drs, dcs):
        nr, nc = r + dr, c + dc
        if in_range(nr, nc):
            dfs(nr, nc)
    visited.remove((r, c))

dfs()
print(res)