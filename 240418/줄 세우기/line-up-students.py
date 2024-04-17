class Student:
    def __init__(self, h, w, n):
        self.h = h
        self.w = w
        self.n = n

N = int(input())
students = []
for i in range(N):
    h, w = map(int, input().split())
    students.append(Student(h, w, i+1))

students.sort(key = lambda s: (-s.h, -s.w, s.n))
for s in students:
    print(s.h, s.w, s.n)