N, M = map(int, input().split())

# 그리드 초기화
grid = [[0] * M for _ in range(N)]

# 방향
dr = [0, 1, 0, -1]
dc = [1, 0, -1, 0]
dir_num = 0

r, c = 0, 0
grid[r][c] = 'A'

def in_range(r, c):
    return 0 <= r < N and 0 <= c < M

for ch in range(ord('B'), ord('A') + (N * M)):

    nr = r + dr[dir_num]
    nc = c + dc[dir_num]

    if (not in_range(nr, nc) or grid[nr][nc] != 0):
        dir_num = (dir_num + 1) % 4

    r += dr[dir_num]
    c += dc[dir_num]
    grid[r][c] = chr(ch)


for row in grid:
    for ch in row:
        print(ch, end=' ')
    print()