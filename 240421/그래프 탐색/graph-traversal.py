N, M = map(int, input().split())

graph = [[] for _ in range(N + 1)]
visited = [False for _ in range(N + 1)]

res = 0

def dfs(v):
    global res

    for cur_v in graph[v]:
        if not visited[cur_v]:
            visited[cur_v] = True
            res += 1
            dfs(cur_v)

for i in range(M):
    v1, v2 = map(int, input().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

visited[1] = True
dfs(1)

print(res)