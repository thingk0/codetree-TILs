N = int(input())
nums = list(map(int, input().split()))

nums.sort()
res = 0

for i in range(N):
    tmp = nums[i] + nums[(2 * N - 1) - i]
    if tmp > res:
        res = tmp

print(res)