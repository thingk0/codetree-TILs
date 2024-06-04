import sys
input = sys.stdin.readline

n, m = map(int, input().split())

parent = [i for i in range(n + 1)]
rank = [1] * (n + 1)

def find(n):
    if parent[n] != n:
        parent[n] = find(parent[n])
    return parent[n]

def union(a, b):
    root_a = find(a)
    root_b = find(b)

    if root_a != root_b:
        if rank[root_a] > rank[root_b]:
            parent[root_b] = root_a
        elif rank[root_b] < rank[root_a]:
            parent[root_a] = root_b
        else:
            parent[root_b] = root_a
            rank[root_a] += 1

for _ in range(m):
    a, b = map(int, input().split())
    union(a, b)


print(parent.count(1) - 1)