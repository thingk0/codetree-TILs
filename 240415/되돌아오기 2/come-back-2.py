N = input()
x, y = 0, 0

ans = -1

# 북, 동, 남, 서
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

# 시작: 북 
dir_num = 0

t = 0
for ch in N:

    if (ch == 'F'):
        x, y = x + dx[dir_num], y + dy[dir_num]
    elif (ch == 'L'):
        dir_num = (dir_num + 3) % 4
    elif (ch == 'R'):
        dir_num = (dir_num + 1) % 4
    
    t += 1

    if x == 0 and y == 0:
        ans = t
        break

print(ans)