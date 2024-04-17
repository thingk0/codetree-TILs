N = int(input())

result = ('2999-12-31', '', '')
for _ in range(N):
    date, day, weather = input().split()
    if weather == 'Rain' and result[0] >= date:
        result = (date, day, weather)

print(result[0], result[1], result[2])