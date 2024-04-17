result = ('', '', '')

N = int(input())
for _ in range(N):
    name, address, region = input().split()
    if name > result[0]:
        result = (name, address, region)

print(f'name {result[0]}\naddr {result[1]}\ncity {result[2]}')