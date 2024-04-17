class Person:
    def __init__(self, n, h, w):
        self.n = n
        self.h = h
        self.w = w

people = []
for _ in range(5):
    n, h, w = input().split()
    h = int(h)
    w = float(w)
    people.append(Person(n, h, w))

print('name')
for s in sorted(people, key=lambda s: s.n):
    print(s.n, s.h, s.w)

print()

print('height')
for s in sorted(people, key=lambda s: -s.h):
    print(s.n, s.h, s.w)