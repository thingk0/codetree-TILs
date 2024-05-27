binary_str, ternary_str = input(), input()
possible_binary_numbers, possible_ternary_numbers = set(), set()

for i in range(len(binary_str)):
    possible_binary_numbers.add(int(binary_str, 2) ^ (1 << i))

for i in range(len(ternary_str)):
    for digit in ['0', '1', '2']:
        if ternary_str[i] == digit:
            continue
        tmp = ternary_str[:i] + digit + ternary_str[i+1:]
        possible_ternary_numbers.add(int(tmp, 3))

common_numbers = possible_binary_numbers.intersection(possible_ternary_numbers)
print(*common_numbers)