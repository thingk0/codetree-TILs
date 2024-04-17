N, K, prefix = input().split()
N = int(N)
K = int(K)

lst = [s for s in (input() for i in range(N)) if s.startswith(prefix)]

lst.sort()
print(lst[K - 1])