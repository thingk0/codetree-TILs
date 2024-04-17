class Student:
    def __init__(self, name, kor, eng, math):
        self.name = name
        self.kor = kor
        self.eng = eng
        self.math = math

N = int(input())

students = []
for _ in range(N):
    students.append(Student(*input().split()))

students.sort(key = lambda s: (-int(s.kor), -int(s.eng), -int(s.math)))
for s in students:
    print(s.name, s.kor, s.eng, s.math)