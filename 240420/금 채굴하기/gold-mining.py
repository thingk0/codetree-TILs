N, M = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(N)]

drs, dcs = [1, 1, -1, -1], [-1, 1, 1, -1]

def in_range(r, c):
    return 0 <= r < N and 0 <= c < N

# k 영역일 때, 채굴 비용
def mining_costs(k):
    return (k ** 2) + ((k + 1) ** 2)

# r,c 영역에서의 최대 금 마진
def gold_margin(r, c):

    max_margin = (grid[r][c] * M) - mining_costs(0)
    prev_margin = max_margin

    for k in range(1, 2 * (N - 1) + 1):
        gold_cnt = 0
        nr = r - k
        nc = c
        for dr, dc in zip(drs, dcs):
            for dis in range(k):
                nr += dr
                nc += dc
                if (in_range(nr, nc)):
                    gold_cnt += grid[nr][nc]

        accrued_margin = prev_margin + (gold_cnt * M - mining_costs(k))
        max_margin = max(max_margin, accrued_margin)
        prev_margin = accrued_margin
    
    return max_margin


res = 0
for r in range(N):
    for c in range(N):
        res = max(res, gold_margin(r, c))

print(res - 1)