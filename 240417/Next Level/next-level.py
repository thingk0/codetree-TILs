class User:

    def __init__(self, name='codetree', lv=10):
        self.name = name
        self.lv = lv
    

name, lv = input().split()
lv = int(lv)

user1 = User()
print(f'user {user1.name} lv {user1.lv}')

user2 = User(name, lv)
print(f'user {user2.name} lv {user2.lv}')