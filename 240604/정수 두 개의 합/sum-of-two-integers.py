import sys

m = int(sys.stdin.readline())
n = int(sys.stdin.readline())

nums = set(map(int, sys.stdin.readline().split()))
cnt = sum((m - num) in nums for num in nums)
print(cnt)