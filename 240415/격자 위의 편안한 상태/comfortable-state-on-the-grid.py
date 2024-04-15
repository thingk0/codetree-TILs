N, M = map(int, input().split())

grid = [[0] * (N + 1) for _ in range(N + 1)]

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

def in_range(r, c):
    return 1 <= r <= N and 1 <= c <= N and grid[r][c] == 1

for _ in range(M):
    cr, cc = map(int, input().split())

    # 해당 칸에 색칠
    grid[cr][cc] = 1

    # 4면 체크해서 '편안한 상태' 인지 조사
    cnt = 0
    for r,c in zip(dr, dc):
        cnt += 1 if in_range(cr + r, cc + c) else 0

    print(1 if cnt == 3 else 0)