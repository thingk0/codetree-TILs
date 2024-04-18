# 회전했을 때, 나올 수 있는 모든 모양
shape = [
    [
        [1, 0, 0],
        [1, 1, 0],
        [0, 0, 0],
    ],
    [
        [1, 1, 0],
        [0, 1, 0],
        [0, 0, 0],
    ],
    [
        [1, 1, 0],
        [0, 1, 0],
        [0, 0, 0],
    ],
    [
        [1, 1, 0],
        [1, 0, 0],
        [0, 0, 0],
    ],
    [
        [1, 1, 1],
        [0, 0, 0],
        [0, 0, 0],
    ],
    [
        [1, 0, 0],
        [1, 0, 0],
        [1, 0, 0],
    ],
]


N, M = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(N)]

def in_range(r, c):
    return 0 <= r < N and 0 <= c < M

def get_max_sum(r, c):
    total_max = 0
    for shape_idx in range(6):
        sum_max = 0
        is_possible = True
        for dr in range(3):
            for dc in range(3):
                nr, nc = r + dr, c + dc
                if shape[shape_idx][dr][dc] == 0:
                    continue
                if not in_range(nr, nc):
                    is_possible = False
                    break
                sum_max += grid[nr][nc]
            if not is_possible:
                break

        if is_possible:
            total_max = max(total_max, sum_max)

    return total_max

res = 0
for r in range(N):
    for c in range(M):
        res = max(res, get_max_sum(r, c))

print(res)