N = int(input())
students = []
for _ in range(N):
    students.append(tuple(input().split()))

students.sort(key = lambda s: (int(s[1]) + int(s[2]) + int(s[3])))
for s in students:
    print(s[0], s[1], s[2], s[3])