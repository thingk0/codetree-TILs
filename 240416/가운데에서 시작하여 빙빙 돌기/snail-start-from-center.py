# 격자 크기
N = int(input())

# 격자 맵 초기화
grid = [[0] * N for _ in range(N)]

# 방향 값 세팅
dr = [0, -1, 0, 1]
dc = [1, 0, -1, 0]

# 범위 유효성 검증
def in_range(r, c):
    return 0 <= r < N and 0 <= c < N


dir_num = 0
start_num = 1
dist = 0

r, c = N // 2, N // 2
grid[r][c] = start_num

while start_num < (N * N):

    # dir_num == 0 or 2 일 때, dist + 1
    if (dir_num == 0 or dir_num == 2):
        dist += 1
    
    # dist 만큼 전진
    for _ in range(dist):

        nr = r + dr[dir_num]
        nc = c + dc[dir_num]

        if not in_range(nr, nc):
            break

        r += dr[dir_num]
        c += dc[dir_num]
        start_num += 1
        grid[r][c] = start_num

    # 방향 전환
    dir_num = (dir_num + 1) % 4


for row in grid:
    for val in row:
        print(val, end=' ')
    print()