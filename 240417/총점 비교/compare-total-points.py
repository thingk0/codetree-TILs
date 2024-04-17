class Student:
    def __init__(self, n, a, b, c):
        self.n = n
        self.a = a
        self.b = b
        self.c = c

N = int(input())
students = []
for _ in range(N):
    n, a, b, c = input().split()
    students.append(Student(n, int(a), int(b), int(c)))

students.sort(key = lambda s: (s.a + s.b +s.c))
for s in students:
    print(s.n, s.a, s.b, s.c)