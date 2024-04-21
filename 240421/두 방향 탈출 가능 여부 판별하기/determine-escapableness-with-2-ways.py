N, M = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(N)]

drs, dcs = [1, 0], [0, 1]

def in_range(r, c):
    return 0 <= r < N and 0 <= c < M 

res = 0
def dfs(r=0, c=0):
    global res

    for dr, dc in zip(drs, dcs):
        nr, nc = r + dr, c + dc

        if not in_range(nr, nc):
            continue
        
        if grid[nr][nc] == 1:
            continue

        if (nr == N - 1) and (nc == M - 1):
            res = 1
            return 

        grid[nr][nc] = 1 
        dfs(nr, nc)

dfs()
print(res)