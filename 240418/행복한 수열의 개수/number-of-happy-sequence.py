# N * N 의 격자에서 연속하여 M 개 이상의 동일한 원소
N, M = map(int, input().split())

# 격자 정보 초기화
grid = [list(map(int, input().split())) for _ in range(N)]

# 주어진 시퀀스가 행복한 수열인지 ?
def is_happy_seq(seq):
    max_seq_cnt, continuous_seq_cnt = 1, 1
    for i in range(1, N):
        if seq[i-1] == seq[i]:
            continuous_seq_cnt += 1
        else:
            continuous_seq_cnt = 1 
        max_seq_cnt = max(max_seq_cnt, continuous_seq_cnt)

    return continuous_seq_cnt >= M

res = 0
for i in range(N):
    # row 조사
    if is_happy_seq(grid[i][:]):
        res += 1
    # col 조사
    if is_happy_seq([row[i] for row in grid]):
        res += 1

print(res)