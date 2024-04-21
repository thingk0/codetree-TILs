N,M = map(int, input().split())
arr = list(map(int, input().split()))

res = 0
def comb(idx, depth, accumulated_sum):

    global res
    if depth == M:
        res = max(res, accumulated_sum)
        return
    
    if idx == N:
        return

    comb(idx + 1, depth, accumulated_sum)
    comb(idx + 1, depth + 1, accumulated_sum ^ arr[idx])

comb(0, 0, 0)
print(res)