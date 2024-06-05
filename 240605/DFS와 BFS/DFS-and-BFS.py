from collections import deque
import sys

input = sys.stdin.readline

n, m, s = map(int, input().split())

graph = {node: [] for node in range(1, n + 1)}
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# 인접 리스트를 정렬하여 방문 순서를 정렬된 순서로 유지
for nodes in graph.values():
    nodes.sort()

def dfs(cur, visited):
    if not visited[cur]:
        print(cur, end=' ')
        visited[cur] = True
        for next in graph[cur]:
            dfs(next, visited)

def bfs(cur, visited):
    q = deque([cur])
    while q:
        t = q.popleft()
        if not visited[t]:
            print(t, end=' ')
            visited[t] = True
            for add in graph[t]:
                q.append(add)

dfs(s, [False] * (n + 1))
print()
bfs(s, [False] * (n + 1))