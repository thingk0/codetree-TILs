N = int(input())

coordinate = []
for i in range(N):
    x, y = map(int, input().split())
    coordinate.append((x, y, i+1))

coordinate.sort(key=lambda c: (abs(c[0]) + abs(c[1])))
for c in coordinate:
    print(c[2])