n = int(input())
n_set = set(list(map(int, input().split())))

m = int(input())
m_list = list(map(int ,input().split()))

for e in m_list:
    if e in n_set:
        print(1, end=' ')
    else:
        print(0, end=' ')