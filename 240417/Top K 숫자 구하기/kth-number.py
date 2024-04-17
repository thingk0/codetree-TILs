N, K = map(int, input().split())
_list = list(map(int, input().split()))
_list.sort()
print(_list[K - 1])