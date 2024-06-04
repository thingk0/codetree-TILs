import sys

std = sys.stdin

n = int(std.readline())
m = int(std.readline())

cnt = 0
nums = {}

for num in map(int, list(std.readline().split())):
    if (m - num) in nums:
        cnt += nums.get(m - num)
    nums[num] = nums.get(num, 0) + 1

print(cnt)