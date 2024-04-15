direction = [
    (0, 1),     # 북
    (1, 0),     # 동
    (0, -1),    # 남
    (-1, 0),    # 서
]

coordinate = [0, 0]
dir = 0

cmd = input()
for c in cmd:
    if c == 'L':
        dir = (dir - 1) % 4
    elif c == 'R':
        dir = (dir + 1) % 4
    elif c == 'F':  
        coordinate[0] += direction[dir][0]
        coordinate[1] += direction[dir][1]

print(coordinate[0], coordinate[1])