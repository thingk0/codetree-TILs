N = int(input())
arr = list(map(int, input().split()))
nums = [(num, i) for i, num in enumerate(arr)]
res = [0 for _ in range(N)]

nums.sort(key=lambda n: (n[0], n[1]))
for i, (_, idx) in enumerate(nums):
    res[idx] = i+1

for i in range(N):
    print(res[i], end=' ')