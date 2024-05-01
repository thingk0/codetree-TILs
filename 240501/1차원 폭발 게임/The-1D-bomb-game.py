n, m = map(int, input().split())
numbers = [
    int(input())
    for _ in range(n)
]

def get_right_idx(left_idx):
    for right_idx in range(left_idx + 1, len(numbers)):
        if numbers[right_idx] != numbers[left_idx]:
            return right_idx - 1
    
    return len(numbers) - 1


while True:

    is_exploded = False
    left_idx = 0

    while left_idx < len(numbers):
        right_idx = get_right_idx(left_idx)

        if right_idx - left_idx + 1 >= m:
            del numbers[left_idx:right_idx + 1]
            is_exploded = True

        else:
            left_idx = right_idx + 1

    if not is_exploded:
        break

print(len(numbers))
for number in numbers:
    print(number)