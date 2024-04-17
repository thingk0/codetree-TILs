class Person:
    def __init__(self, n, h, w):
        self.n = n
        self.h = h
        self.w = w

N = int(input())

people = []
for _ in range(N):
    n, h, w = input().split()
    h, w = int(h), int(w)
    people.append(Person(n, h, w))


people.sort(key=lambda p: (p.h, -p.w))
for p in people:
    print(p.n, p.h, p.w)