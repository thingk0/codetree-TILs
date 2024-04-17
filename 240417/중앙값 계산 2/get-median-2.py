N = int(input())
nums = list(map(int, input().split()))

for i in range(N):
    if i % 2 == 0:
        sorted_nums = sorted(nums[:i+1])
        print(sorted_nums[i // 2], end=' ')