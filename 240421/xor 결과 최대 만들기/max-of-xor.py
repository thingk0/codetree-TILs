N,M = map(int, input().split())
arr = list(map(int, input().split()))

res = 0
selected = []

def comb(idx, depth):
    if depth == M:
        global res
        xor_sum = 0
        for num in selected:
            xor_sum ^= num
        res = max(res, xor_sum)
        return

    for i in range(idx, N):
        selected.append(arr[i])
        comb(i + 1, depth + 1)
        selected.pop()

comb(0, 0)
print(res)