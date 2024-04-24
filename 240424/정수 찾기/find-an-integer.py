n = int(input())
n_set = set(list(map(int, input().split())))

m = int(input())
m_arr = list(map(int, input().split()))

for e in m_arr:
    if e in n_set:
        print(1)
    else:
        print(0)