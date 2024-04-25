from collections import deque

n, k = map(int, input().split())

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

visited = [
    [False] * n
    for _ in range(n)
]

drs, dcs = [1, 0, -1, 0], [0, 1, 0, -1]

def in_range(r, c):
    return 0 <= r < n and 0 <= c < n

q = deque()
def bfs():
    while q:
        r, c = q.popleft()
        for dr, dc in zip(drs, dcs):
            nr, nc = r + dr, c + dc

            if not in_range(nr, nc) or grid[nr][nc] or visited[nr][nc]:
                continue

            q.append((nr, nc))
            visited[nr][nc] = True

for _ in range(k):
    row, col = map(int, input().split())
    visited[row - 1][col - 1] = True
    q.append((row - 1, col - 1))

bfs()

print(sum([1 for i in range(n) for j in range(n) if visited[i][j]]))