n, m, k = map(int, input().split())
k -= 1

grid = [
    list(map(int, input().split()))
    for _ in range(n)
]

def is_range_empty(row, start_col, end_col):
    return all([not grid[row][col] for col in range(start_col, end_col + 1)])

def find_row_for_placement():
    for row in range(n - 1):
        if not is_range_empty(row + 1, k, k + m - 1):
            return row
    return n - 1

row = find_row_for_placement()
for col in range(k, k + m):
    grid[row][col] = 1

for i in range(n):
    print(*grid[i])