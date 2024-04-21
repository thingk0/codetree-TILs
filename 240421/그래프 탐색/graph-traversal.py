N, M = map(int, input().split())
graph = [tuple(map(int, input().split())) for _ in range(M)]

root = [n for n in range(N + 1)]
rank = [1] * (N + 1)

def find(x):
    if root[x] != x:
        root[x] = find(root[x])
    return root[x]

def union(x, y):
    rootX = find(x)
    rootY = find(y)
    if rootX != rootY:
        if rank[rootX] > rank[rootY]:
            root[rootY] = rootX
        elif rank[rootX] < rank[rootY]:
            root[rootX] = rootY
        else:
            root[rootY] = rootX
            rank[rootX] += 1

for (x, y) in graph:
    union(x, y)

final_roots = [find(i) for i in range(1, N + 1)]
print(len(set(final_roots)))