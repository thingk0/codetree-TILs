N = int(input())
grid = [
    list(map(int, input().split())) 
    for _ in range(N)
    ]

bomb_list = [(r, c) for r in range(N) for c in range(N) if grid[r][c] == 1]

def in_range(r, c):
    return 0 <= r < N and 0 <= c < N

def a_type_bomb(r, c, copy_grid):
    cnt = 0
    # 위아래 2칸씩
    if in_range(r - 2, c) and copy_grid[r - 2][c] == 0:
        copy_grid[r - 2][c] = 1
        cnt += 1
    if in_range(r - 1, c) and copy_grid[r - 1][c] == 0:
        copy_grid[r - 1][c] = 1
        cnt += 1
    if in_range(r + 1, c) and copy_grid[r + 1][c] == 0:
        copy_grid[r + 1][c] = 1
        cnt += 1
    if in_range(r + 2, c) and copy_grid[r + 2][c] == 0:
        copy_grid[r + 2][c] = 1
        cnt += 1
    
    return cnt

def b_type_bomb(r, c, copy_grid):
    cnt = 0
    # 상하좌우
    if in_range(r - 1, c) and copy_grid[r - 1][c] == 0:
        copy_grid[r - 1][c] = 1
        cnt += 1
    if in_range(r + 1, c) and copy_grid[r + 1][c] == 0:
        copy_grid[r + 1][c] = 1
        cnt += 1
    if in_range(r, c + 1) and copy_grid[r][c + 1] == 0:
        copy_grid[r][c + 1] = 1
        cnt += 1
    if in_range(r, c - 1) and copy_grid[r][c - 1] == 0:
        copy_grid[r][c - 1] = 1
        cnt += 1

    return cnt


def c_type_bomb(r, c, copy_grid):
    cnt = 0
    # 좌상우상좌하우하
    if in_range(r - 1, c - 1) and copy_grid[r - 1][c - 1] == 0:
        copy_grid[r - 1][c - 1] = 1
        cnt += 1
    if in_range(r - 1, c + 1) and copy_grid[r - 1][c + 1] == 0:
        copy_grid[r - 1][c + 1] = 1
        cnt += 1
    if in_range(r + 1, c + 1) and copy_grid[r + 1][c + 1] == 0:
        copy_grid[r + 1][c + 1] = 1
        cnt += 1
    if in_range(r + 1, c - 1) and copy_grid[r + 1][c - 1] == 0:
        copy_grid[r + 1][c - 1] = 1
        cnt += 1

    return cnt

res = 0
selected = []

def comb(depth):
    if (depth == len(bomb_list)):
        global res
        copy_grid = [row[:] for row in grid]
        max_bomb_cnt = len(bomb_list)
        for (r, c), bomb_type in zip(bomb_list, selected):
            if bomb_type == 1:
                max_bomb_cnt += a_type_bomb(r, c, copy_grid)  
            elif bomb_type == 2:
                max_bomb_cnt += b_type_bomb(r, c, copy_grid)
            elif bomb_type == 3:
                max_bomb_cnt += c_type_bomb(r, c, copy_grid)
        res = max(res, max_bomb_cnt)
        return
    
    for i in range(1, 4):
        selected.append(i)
        comb(depth + 1)
        selected.pop()

comb(0)
print(res)