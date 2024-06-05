from collections import deque
import sys

input = sys.stdin.readline

n, m, s = map(int, input().split())

graph = {node: [] for node in range(1, n+1)}
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(visited = [False] * (n+1), cur = 1):
    if not visited[cur]:
        print(cur, end=' ')
        visited[cur] = True
        for next in graph[cur]:
            dfs(visited, next)

def bfs(visited = [False] * (n+1), cur = 1):
    q = deque([cur])
    while q:
        t = q.popleft()
        if not visited[t]:
            print(t, end = ' ')
            visited[t] = True
            for add in graph[t]:
                q.append(add)

dfs()
print()
bfs()