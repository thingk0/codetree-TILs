import sys

def _input():
    return sys.stdin.readline()

n = int(_input())

closet = {}
for _ in range(n):
    _, category = _input().split()
    closet[category] = closet.get(category, 0) + 1

res = 1
for cnt in closet.values():
    res *= (cnt + 1)

print(res - 1)