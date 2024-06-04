n = int(input())

comb = {}
for _ in range(n):
    key = ''.join(sorted(input().split()))
    comb[key] = comb.get(key, 0) + 1

print(max(comb.values()))