# 격자의 크기
N = int(input())

# N * N 격자 생성
grid = []
for _ in range(N):
    grid.append(list(input()))

# 레이저의 방향을 위한
dr = [1, 0, -1, 0]
dc = [0, 1, 0, -1]

def in_range(r, c):
    return 0 <= r < N and 0 <= c < N

# 출발 지점과 방향 
start = int(input())
if start <= (1 * N):
    r,c = 0, start - 1
    dir_num = 0
elif start <= (2 * N):
    r,c = (start - N - 1), N - 1
    dir_num = 3
elif start <= (3 * N):
    r,c = N - 1, (3 * N) - start
    dir_num = 2
else:
    r,c = (3 * N) - start, 0
    dir_num = 1

cnt = 0
while in_range(r, c):
    if grid[r][c] == '\\':
        dir_num = (dir_num ^ 1)
    elif grid[r][c] == '/':
        dir_num = (3 - dir_num)
    r += dr[dir_num]
    c += dc[dir_num]
    cnt += 1


print(cnt)