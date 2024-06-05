from collections import deque
import sys

input = sys.stdin.readline

# 노드 수, 간선 수, 시작 노드 입력
n, m, s = map(int, input().split())

# 그래프 초기화
graph = {node: [] for node in range(1, n + 1)}

# 간선 정보 입력
for _ in range(m):
    node_a, node_b = map(int, input().split())
    graph[node_a].append(node_b)
    graph[node_b].append(node_a)

# 인접 리스트 정렬
for adj_list in graph.values():
    adj_list.sort()

def dfs(cur, visited):
    if not visited[cur]:
        print(cur, end=' ')
        visited[cur] = True
        for next in graph[cur]:
            dfs(next, visited)

def bfs(start, visited):
    queue = deque([start])
    while queue:
        cur = queue.popleft()
        if not visited[cur]:
            print(cur, end=' ')
            visited[cur] = True
            for next in graph[cur]:
                queue.append(next)


dfs(s, [False] * (n + 1))
print()
bfs(s, [False] * (n + 1))