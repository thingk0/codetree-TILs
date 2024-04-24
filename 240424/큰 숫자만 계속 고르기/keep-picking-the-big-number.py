import heapq

pq = []

def push(e):
    heapq.heappush(pq, -e)

def pop():
    return -heapq.heappop(pq)

n, m = map(int, input().split())
arr = list(map(int, input().split()))

for e in arr:
    push(e)

for _ in range(m):
    max_num = pop()
    push(max_num - 1)

print(-pq[0])