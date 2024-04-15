n, t = map(int, input().split())
x, y, c_dir = input().split()

mapper = {
    'R': 0,
    'D': 1,
    'U': 2,
    'L': 3
}
x, y = int(x) - 1, int(y) - 1
move_dir = mapper[c_dir]

dxs = [0, 1, -1,  0]
dys = [1, 0,  0, -1]

def in_range(x, y):
    return 0 <= x < n and 0 <= y < n

for _ in range(t):
    nx, ny = x + dxs[move_dir], y + dys[move_dir]
    if in_range(nx, ny):
        x, y = nx, ny
    else:
        move_dir = 3 - move_dir

print(x + 1, y + 1)