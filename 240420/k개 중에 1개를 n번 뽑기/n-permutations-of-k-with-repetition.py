K, N = map(int, input().split())

selected = []

def print_permute():
    for num in selected:
        print(num, end=' ')
    print()

def permute(cnt):
    if cnt == N:
        print_permute()
        return

    for num in range(1, K + 1):
        selected.append(num)
        permute(cnt + 1)
        selected.pop()

permute(0)