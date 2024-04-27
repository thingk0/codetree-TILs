class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

def connect(s, e):
    if s is not None:
        s.next = e
    if e is not None:
        e.prev = s

def insert_next(target, s):
    connect(s, target.next)
    connect(target, s)

def insert_prev(target, s):
    connect(target.prev, s)
    connect(s, target)


def print_node(target):
    n = '(Null)'
    if target.prev is None:
        print(n, end=' ')
    else:
        print(target.prev.data, end=' ')

    print(target.data, end=" ")

    if target.next is None:
        print(n)
    else:
        print(target.next.data)


cur = Node(input())
n = int(input())

for _ in range(n):

    arr = input().split()
    option = int(arr[0])

    if option == 1:
        data = arr[1]
        target = Node(data)
        insert_prev(cur, target)

    if option == 2:
        data = arr[1]
        target = Node(data)
        insert_next(cur, target)

    if option == 3:
        if cur.prev is not None:
            cur = cur.prev

    if option == 4:
        if cur.next is not None:
            cur = cur.next

    print_node(cur)