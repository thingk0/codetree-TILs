import heapq

class PriorityQueue:
    def __init__(self):          
        self.items = []
                
    def push(self, item):        
        heapq.heappush(self.items, -item)
                
    def empty(self):             
        return not self.items
                
    def size(self):              
        return len(self.items)
        
    def pop(self):
        if self.empty():
            raise Exception("PriorityQueue is empty")
            
        return -heapq.heappop(self.items)
                
    def top(self):
        if self.empty():
            raise Exception("PriorityQueue is empty")                  
        return -self.items[0]

pq = PriorityQueue()

n = int(input())
for _ in range(n):
    cmd = input()
    if cmd.startswith("push"):
        x = int(cmd.split()[1])
        pq.push(x)
    elif cmd == "pop":
        print(pq.pop())
    elif cmd == "size":
        print(pq.size())
    elif cmd == "empty":
        print(1 if pq.empty() else 0)
    else:
        print(pq.top())