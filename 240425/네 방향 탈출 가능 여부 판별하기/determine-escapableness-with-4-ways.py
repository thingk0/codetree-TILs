from collections import deque

n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
visited = [[False] * m for _ in range(n)]


drs, dcs = [1, 0, -1, 0], [0, 1, 0, -1]

def in_range(r, c):
    return 0 <= r < n and 0 <= c < m

q = deque()
def bfs():
    
    q.append((0, 0))
    visited[0][0] = True

    while q:
        r, c = q.popleft()
        for dr, dc in zip(drs, dcs):
            nr, nc = r + dr, c + dc
            if in_range(nr, nc) and grid[nr][nc] == 1 and not visited[nr][nc]:
                visited[nr][nc] = True
                q.append((nr, nc))

bfs()
print(1 if visited[n - 1][m - 1] else 0)