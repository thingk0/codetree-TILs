n = int(input())
jenga = [int(input()) for _ in range(n)]

def cut(s, e):
    global jenga
    tmp = []
    for i in range(len(jenga)):
        if (s <= i <= e):
            continue
        tmp.append(jenga[i])
    jenga = tmp
        
for _ in range (2):
    s, e = map(int, input().split())
    cut(s - 1, e - 1)

print(len(jenga))
for e in jenga:
    print(e)