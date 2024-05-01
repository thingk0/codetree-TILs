n = 4
grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

def rotate():
    global grid
    next_grid = [([0] * n) for _ in range(n)]
    for i in range(n):
        for j in range(n):
            next_grid[i][j] = grid[n - j - 1][i]
    grid = next_grid


def drop():
    global grid
    next_grid = [([0] * n) for _ in range(n)]
    
    for j in range(n):
        keep_num, next_row = -1, n - 1
        
        for i in range(n - 1, -1, -1):
            if not grid[i][j]:
                continue
                
            if keep_num == -1:
                keep_num = grid[i][j];

            elif keep_num == grid[i][j]:
                next_grid[next_row][j] = keep_num * 2
                keep_num = -1
                next_row -= 1

            else:
                next_grid[next_row][j] = keep_num
                keep_num = grid[i][j]
                next_row -= 1
        
        if keep_num != -1:
            next_grid[next_row][j] = keep_num
            next_row -= 1
    
    grid = next_grid

dir_mapper = {
    'D': 0,
    'R': 1,
    'U': 2,
    'L': 3
}
move_dir = dir_mapper[input()]

for _ in range(move_dir):
    rotate()

drop()

for _ in range(4 - move_dir):
    rotate()

for i in range(n):
    print(*grid[i])