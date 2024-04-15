N = int(input())

coordinate = [0, 0]

for i in range(N):
    dir, dis = input().split()
    if dir == 'N':
        coordinate[1] += int(dis)
    elif dir == 'S':
        coordinate[1] -= int(dis)
    elif dir == 'E':
        coordinate[0] += int(dis)
    elif dir == 'W':
        coordinate[0] -= int(dis)

print(coordinate[0], coordinate[1])