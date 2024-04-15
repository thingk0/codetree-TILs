n, m = map(int, input().split())

dr = [0, 1, 0, -1]
dc = [1, 0, -1, 0]

map = [[0] * m for _ in range(n)]
r, c, d = 0, 0, 0
map[r][c] = 1

def in_range(r, c):
    return 0 <= r < n and 0 <= c < m

for num in range(2, n * m + 1):
    nr = r + dr[d]
    nc = c + dc[d]

    if not in_range(nr, nc) or map[nr][nc] != 0:
        d = (d + 1) % 4
        nr = r + dr[d]
        nc = c + dc[d]

    r, c = nr, nc
    map[r][c] = num

for row in map:
    for num in row:
        print(num, end=' ')
    print()