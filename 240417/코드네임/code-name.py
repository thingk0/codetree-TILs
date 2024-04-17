min_val = ('Z', 2**10)

for _ in range(5):
    code_name, score = input().split()
    if min_val[1] > int(score):
        min_val = (code_name, int(score))

print(min_val[0], min_val[1])