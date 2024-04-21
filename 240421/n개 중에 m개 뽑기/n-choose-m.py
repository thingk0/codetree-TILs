N, M = map(int, input().split())

selected = []
def comb(start, depth):
    if depth == M:
        print(*selected)
        return

    for num in range(start, N + 1):
        selected.append(num)
        comb(num + 1, depth + 1)
        selected.pop()

comb(1, 0)