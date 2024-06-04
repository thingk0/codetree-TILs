n = int(input())

closet = {}
for _ in range(n):
    _, category = input().split()
    closet[category] = closet.get(category, 0) + 1

res = 1
for cnt in closet.values():
    res *= (cnt + 1)

print(res - 1)