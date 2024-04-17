N = int(input())
people = [(n, int(h), int(w)) for n, h, w in (input().split() for _ in range(N))]

people.sort(key=lambda p: p[1])
for n, h, w in people:
    print(n, h, w)