n = int(input())

x, y = 0, 0

dxs, dys = [1, -1, 0, 0], [0, 0, -1, 1]

ans = -1
t = 0

def move(move_dir, dist):
    global x, y
    global ans, t
    
    for _ in range(dist):
        x, y = x + dxs[move_dir], y + dys[move_dir]
        t += 1
        if x == 0 and y == 0:
            ans = t
            return True
    return False


for _ in range(n):
    
    c_dir, dist = input().split()
    dist = int(dist)

    if c_dir == 'E':
        move_dir = 0
    elif c_dir == 'W':
        move_dir = 1
    elif c_dir == 'S':
        move_dir = 2
    else:
        move_dir = 3

    if move(move_dir, dist):
        break

print(ans)