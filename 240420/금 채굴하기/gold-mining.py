N, M = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(N)]

drs, dcs = [1, 1, -1, -1], [-1, 1, 1, -1]

def in_range(r, c):
    return 0 <= r < N and 0 <= c < N

# k 영역일 때, 채굴 비용
def mining_costs(k):
    return (k * k) + ((k + 1) * (k + 1))

# r,c 영역에서의 금 카운트
def get_gold_count(r, c, k):

    if (k == 0):
        return grid[r][c]

    gold_cnt = 0
    nr = r - k
    nc = c

    for dr, dc in zip(drs, dcs):
        for dis in range(k):
            if (in_range(nr, nc)):
                gold_cnt += grid[nr][nc]
            nr += dr
            nc += dc

    return gold_cnt

res = 0
for r in range(N):
    for c in range(N):
        gold_cnt = 0
        for k in range(2 * (N - 1) + 1):
            gold_cnt += get_gold_count(r, c, k)
            if gold_cnt * M > mining_costs(k):
                res = max(res, gold_cnt)

print(res)