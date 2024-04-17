N = int(input())

students = []
for i in range(N):
    h, w = map(int, input().split())
    students.append((h, w, i+1))

students.sort(key=lambda s: (s[0], -s[1]))
for s in students:
    print(s[0], s[1], s[2])