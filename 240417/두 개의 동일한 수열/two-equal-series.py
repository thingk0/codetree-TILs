N = input()
A = input().split()
B = input().split()

def equals(A, B):
    for a, b in zip(A, B):
        if a != b:
            return 'No'
    return 'Yes'

A.sort()
B.sort()

print(equals(A, B))