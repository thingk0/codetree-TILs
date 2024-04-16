N, T = map(int, input().split())
cmd = input()
grid = [list(map(int, input().split())) for _ in range(N)]

# 북 -> 동 -> 남 -> 서
dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

# 초기 방향
dir_num = 0

# 시작 위치
r, c = N // 2, N // 2

def in_range(r, c):
    return 0 <= r < N and 0 <= c < N

# 총 합
sum = grid[r][c]
for ch in cmd:
    if ch == 'L':
        dir_num = (3 + dir_num) % 4 
    elif ch == 'R':
        dir_num = (1 + dir_num) % 4
    elif ch == 'F':
        nr = r + dr[dir_num]
        nc = c + dc[dir_num]
        if not in_range(nr, nc):
            continue
        r = nr
        c = nc
        sum += grid[r][c]

print(sum)