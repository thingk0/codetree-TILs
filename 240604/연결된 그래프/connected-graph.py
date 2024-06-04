import sys
input = sys.stdin.readline

n, m = map(int, input().split())

parent = [i for i in range(n + 1)]
rank = [1] * (n + 1)

def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]

def union(x, y):
    root_x = find(x)
    root_y = find(y)

    if root_x != root_y:
        if rank[root_x] > rank[root_y]:
            parent[root_y] = root_x
        elif rank[root_x] < rank[root_y]:
            parent[root_x] = root_y
        else:
            parent[root_y] = root_x
            rank[root_x] += 1

for _ in range(m):
    a, b = map(int, input().split())
    union(a, b)

root_of_1 = find(1)
print(sum(1 for i in range(1, n + 1) if find(i) == root_of_1) - 1)