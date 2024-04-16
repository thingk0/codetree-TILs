N, M = map(int, input().split())

# N * M 맵 초기화
grid = [[0] * M for _ in range(N)]

# 시작 숫자 초기화
r, c = 0, 0
grid[r][c] = 1

# 방향 순서 초기화
dr = [1, 0, -1, 0]
dc = [0, 1, 0, -1]
dir_num = 0

def in_range(r, c):
    return 0 <= r < N and 0 <= c < M

for num in range(2, N * M + 1):

    nr = r + dr[dir_num]
    nc = c + dc[dir_num]

    if not in_range(nr, nc) or grid[nr][nc] != 0:
        dir_num = (dir_num + 1) % 4
    
    r += dr[dir_num]
    c += dc[dir_num]
    grid[r][c] = num


for row in grid:
    for value in row:
        print(value, end=' ')
    print()