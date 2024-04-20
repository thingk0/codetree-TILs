import sys

# 변수 선언 및 입력:
N, M = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(N)]

# 누적 합 계산
psum = [[0] * (M + 1) for _ in range(N + 1)]
for i in range(1, N + 1):
    for j in range(1, M + 1):
        psum[i][j] = grid[i-1][j-1] + psum[i-1][j] + psum[i][j-1] - psum[i-1][j-1]

# 주어진 직사각형 영역의 합 계산
def rect_sum(x1, y1, x2, y2):
    return psum[x2+1][y2+1] - psum[x1][y2+1] - psum[x2+1][y1] + psum[x1][y1]

# 두 직사각형이 겹치는지 검사
def not_overlapped(x1, y1, x2, y2, x3, y3, x4, y4):
    return x2 < x3 or x4 < x1 or y2 < y3 or y4 < y1

max_sum = -sys.maxsize
# 최대 합 찾기
# 모든 가능한 첫 번째 직사각형에 대해
for x1 in range(N):
    for y1 in range(M):
        for x2 in range(x1, N):
            for y2 in range(y1, M):
                first_sum = rect_sum(x1, y1, x2, y2)
                # 모든 가능한 두 번째 직사각형에 대해
                for x3 in range(N):
                    for y3 in range(M):
                        for x4 in range(x3, N):
                            for y4 in range(y3, M):
                                if not_overlapped(x1, y1, x2, y2, x3, y3, x4, y4):
                                    second_sum = rect_sum(x3, y3, x4, y4)
                                    max_sum = max(max_sum, first_sum + second_sum)

print(max_sum)