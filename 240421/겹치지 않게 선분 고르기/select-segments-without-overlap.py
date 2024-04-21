N = int(input())
lines = [tuple(map(int, input().split())) for _ in range(N)]

def is_overraped(line1, line2):
    (x1, x2), (x3, x4) = line1, line2
    return (x1 <= x3 <= x2) or (x1 <= x4 <= x2) or (x3 <= x1 <= x4) or (x3 <= x2 <= x4)

def is_possible():
    for i, line1 in enumerate(selected):
        for j, line2 in enumerate(selected):
            if i < j and is_overraped(line1, line2):
                return False

    return True

res = 0
selected = []
def comb(depth):
    global res

    if depth == N:
        if is_possible():
            res = max(res, len(selected))
        return

    selected.append(lines[depth])
    comb(depth + 1)

    selected.pop()
    comb(depth + 1)

comb(0)
print(res)